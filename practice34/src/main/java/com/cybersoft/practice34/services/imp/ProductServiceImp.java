package com.cybersoft.practice34.services.imp;

import com.cybersoft.practice34.dto.ProductDto;
import com.cybersoft.practice34.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    private List<ProductDto> list = new ArrayList<>();

    @Override
    public List<ProductDto> getAllProduct() {
        return list;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        list.add(productDto);
        return productDto;
    }

    @Override
    public ProductDto getProductById(int id) {
        for(ProductDto p : list){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public ProductDto updateProductById(int id, ProductDto newProduct) {
        for(ProductDto p : list){
            if(p.getId() == id){
                p.setName(newProduct.getName());
                p.setPrice(newProduct.getPrice());

                return p;
            }
        }


        return null;


    }

    @Override
    public boolean deleteProductById(int id) {
        for(ProductDto p : list){
            if(p.getId() == id){
                list.remove(p);
                return true;
            }
        }

        return false;
    }
}
