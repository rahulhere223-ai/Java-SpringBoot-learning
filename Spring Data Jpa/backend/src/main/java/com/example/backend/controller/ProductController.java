package com.example.backend.controller;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.ProductRequest;
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

    @GetMapping("/hello")
    public String hello(){
        return productService.getHello();
    }

    @GetMapping("/products/message")
    public String Msg(){
        return productService.getMsg();
    }

    @PostMapping("/products")
    public ProductResponse createProduct(@Valid @RequestBody ProductRequest request){
        return productService.createProduct(request);
    }

    @GetMapping("/products")
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/count")
    public int getnoofprod(){
        return productService.countofprod();
    }

    @GetMapping("products/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable int id){
        ProductResponse product=productService.getProductById(id);

        if(product == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(product);
    }

    @PutMapping("/products/{id}")
    public ProductResponse updateProduct(@PathVariable int id,@Valid @RequestBody ProductRequest request){
        return productService.updateproductById(id,request);
    }

    @PatchMapping("/products/{id}")
    public Product updateusingPatch(@PathVariable int id,@RequestBody ProductRequest request){
        return productService.updateproductById2(id,request);
    }

    @DeleteMapping("/products/{id}")
    public Product deleteById(@PathVariable int id){
        return productService.deleteproductById(id);
    }

    @GetMapping("/products/category/{categoryId}")
    public List<ProductResponse> getProductsByCategory(@PathVariable int categoryId){
        return productService.getProductsByCategory(categoryId);
    }

    @GetMapping("/products/category/name/{categoryName}")
    public List<ProductResponse> getProductByCategoryName(@PathVariable String categoryName){
        return productService.getProductByCategoryName(categoryName);
    }

    @GetMapping("/products/above-price/{price}")
    public List<ProductResponse> getProductsAbovePrice(@PathVariable int price){
        return productService.getProductsAbovePrice(price);
    }
    @GetMapping ("/products/search")
    public List<ProductResponse> getProductByCatgeoryAndPrice(@RequestParam("category") String categoryName,@RequestParam("price") int price){
        return productService.getProductByCategoryAndPrice(categoryName,price);
    }
    @GetMapping("/products/page")
    public Page<ProductResponse> getProducts(Pageable pageable){
        return productService.getproducts(pageable);
    }

    @GetMapping("/products/with-category")
    public List<ProductResponse> getAllProductsWithCatgeory(){
        return productService.getProductWithCatgeory();
    }

    @GetMapping("products/dto")
    public List<ProductResponse> getAllProducts2(){
        return productService.findProductsasDTO();
    }

}
