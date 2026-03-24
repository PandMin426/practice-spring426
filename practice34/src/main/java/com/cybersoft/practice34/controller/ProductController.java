package com.cybersoft.practice34.controller;

import com.cybersoft.practice34.dto.ProductDto;
import com.cybersoft.practice34.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getProducts(){
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto){

        return ResponseEntity.ok(productService.createProduct(productDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id){
        ProductDto productDto = productService.getProductById(id);
        if(productDto == null){
            return ResponseEntity.status(404).body("Product not found");
        }
        return ResponseEntity.ok(productDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProductById(@PathVariable int id,
                                               @RequestBody ProductDto newProduct){
        ProductDto productDto = productService.updateProductById(id, newProduct);
        if(productDto == null){
            return ResponseEntity.status(404).body("Product not found");
        }
        return ResponseEntity.ok(productDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable int id){
        boolean check = productService.deleteProductById(id);
        if(check == false){
            return ResponseEntity.status(404).body("Product not found");
        }

        return ResponseEntity.ok("Delete successfully");
    }



}
