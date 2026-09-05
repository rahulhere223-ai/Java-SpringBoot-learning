package com.example.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.dto.ProductResponse;
import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;


@Service 
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public ProductResponse createProduct(Product request){
        Product productfullinfo= productRepository.save(request);

        return toResponse(productfullinfo);
    }
    public List<ProductResponse> getAll(){
        List<Product> productfullinfo=productRepository.findAll();

        List<ProductResponse> responses=new ArrayList<>();

        for(Product product : productfullinfo){
            responses.add(toResponse(product));
        }

        return responses;
    }
    
    public ProductResponse getproductById(int id){
        Product productfullinfo= productRepository.getproductById(id);

        return toResponse(productfullinfo);
    }
    

    public ProductResponse updateproductById(Product request,int id){
        Product productfullinfo= productRepository.updateproductById(request,id);

        return toResponse(productfullinfo);
    }

    public ProductResponse updateProductById(Product request,int id){
        Product product=productRepository.updaProductById2(request, id);

        return toResponse(product);
    }

    public ProductResponse deleteProductById(int id){
        return toResponse(productRepository.deleteProductById(id));
    }

    public ProductResponse toResponse(Product product){
        ProductResponse response=new ProductResponse();

        response.setName(product.getName());
        response.setId(product.getId());
        response.setPrice(product.getPrice());
        response.setCategory(product.getCategory());

        return response;

    }

}
