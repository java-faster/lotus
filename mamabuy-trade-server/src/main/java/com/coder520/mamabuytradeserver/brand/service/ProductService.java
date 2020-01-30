package com.coder520.mamabuytradeserver.brand.service;

import com.coder520.mamabuytradeserver.brand.entity.PageSearch;
import com.coder520.mamabuytradeserver.brand.entity.Product;
import com.coder520.mamabuytradeserver.common.resp.ApiResult;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("productService")
public interface ProductService {
    List<Product> searchProduct( int pageNumber,int pageSize,String searchContent) throws IOException;
}
