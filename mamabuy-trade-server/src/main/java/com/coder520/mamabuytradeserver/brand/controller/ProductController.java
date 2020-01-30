package com.coder520.mamabuytradeserver.brand.controller;

import com.coder520.mamabuytradeserver.brand.entity.PageSearch;
import com.coder520.mamabuytradeserver.brand.entity.Product;
import com.coder520.mamabuytradeserver.brand.service.ProductService;
import com.coder520.mamabuytradeserver.common.constants.Constants;
import com.coder520.mamabuytradeserver.common.resp.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/search")
    public ApiResult<List<Product>> searchProduct(@RequestBody PageSearch pageSearch)throws IOException {
        ApiResult<List<Product>> result=new ApiResult<>(Constants.RESP_STATUS_OK,"查询成功");
        List<Product> list=productService.searchProduct(pageSearch.getPageNumber(),pageSearch.getPageSize(),pageSearch.getSearchContent());
        result.setData(list);
        return result;
    }

}
