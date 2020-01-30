package com.coder520.mamabuytradeserver.brand.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.coder520.mamabuytradeserver.brand.entity.PageSearch;
import com.coder520.mamabuytradeserver.brand.entity.Product;
import com.coder520.mamabuytradeserver.common.resp.ApiResult;
import io.searchbox.client.http.JestHttpClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {


    int PAGE_SIZE=15;

    int PAGE_NUMBER=0;


    @Autowired
    private JestHttpClient esClient;

    @Override
    public List<Product> searchProduct(int pageNumber, int pageSize, String searchContent) throws IOException {

        if (pageNumber<0){
            pageNumber=PAGE_NUMBER;
        }

        if(pageSize==0){
            pageSize=PAGE_SIZE;
        }

        SearchSourceBuilder sourceBuilder=new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders
                .boolQuery()
                .must(QueryBuilders.matchQuery("spu_name",searchContent))
                .must(QueryBuilders.matchQuery("status",1)))
                .from(pageSize)
                .size(pageNumber);
        Search search = new Search.Builder(sourceBuilder.toString())
                .addIndex("mama-buy-trade")
                .build();
        SearchResult response = esClient.execute(search);
        String jsonString = response.getJsonString();
        List<Product> productList = parseResult(jsonString);

        return productList;
    }

    private List<Product> parseResult(String jsonString) {
        JSONArray jsonArray = JSON.parseObject(jsonString).getJSONObject("hits").getJSONArray("hits");
        List<Product> productList = new ArrayList<>();
        for(int i=0;i<jsonArray.size();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            JSONObject productObj = jsonObject.getJSONObject("_source");
            Product product = new Product();
            product.setId(productObj.getLongValue("id"));
            product.setCategoryId(productObj.getLongValue("category_id"));
            product.setBrandId(productObj.getLongValue("brand_id"));
            product.setSpuName(productObj.getString("spu_name"));
            product.setPrice(productObj.getBigDecimal("price"));

            productList.add(product);
        }
        return productList;
    }
}
