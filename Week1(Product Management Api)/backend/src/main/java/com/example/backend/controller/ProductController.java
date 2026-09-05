package com.example.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.ProductResponse;
import com.example.backend.model.Product;
import com.example.backend.service.ProductService;

import jakarta.validation.Valid;

@RestController 
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @PostMapping("/products")
    public ProductResponse createProduct(@Valid @RequestBody Product request){
        return productService.createProduct(request);
    }


    @GetMapping("/products")
    public List<ProductResponse> getProduct(){
        return productService.getAll();
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductResponse> getproductById(@PathVariable int id){
        ProductResponse response= productService.getproductById(id);

        if(response == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/products/{id}")
    public ProductResponse updateproductById(@Valid @RequestBody Product request,@PathVariable int id){
        return productService.updateproductById(request,id);
    }

    @PatchMapping("/products/{id}")
    public ProductResponse updateProductById2(@RequestBody Product request,@PathVariable int id){
        return productService.updateProductById(request,id);
    }

    @DeleteMapping("/products/{id}")
    public ProductResponse deleteProductById(@PathVariable int id){
        return productService.deleteProductById(id);
    }

}
