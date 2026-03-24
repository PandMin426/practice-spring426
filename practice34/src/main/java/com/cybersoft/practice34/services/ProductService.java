package com.cybersoft.practice34.services;

import com.cybersoft.practice34.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProduct();
    ProductDto createProduct(ProductDto productDto);
    ProductDto getProductById(int id);
    ProductDto updateProductById(int id, ProductDto newProduct);
    boolean deleteProductById(int id);
}
