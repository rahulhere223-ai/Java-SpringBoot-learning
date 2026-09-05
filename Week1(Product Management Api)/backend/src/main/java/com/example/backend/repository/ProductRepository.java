package com.example.backend.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.backend.model.Product;

@Repository 
public class ProductRepository {

    private int nextId=1;

    List<Product> products=new ArrayList<>();

    public Product save(Product product){
        product.setId(nextId);
        product.setInternalCode("SECRET-001");
        nextId++;
        products.add(product);

        return product;
    }
    public List<Product> findAll(){
        return products;
    }

    public Product getproductById(int id){
        for(Product product : products){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }
    
    public Product updateproductById(Product request,int id){
        for(Product product: products){
            if(product.getId() == id){
                product.setName(request.getName());
                product.setPrice(request.getPrice());
                product.setCategory(request.getCategory());

                return product;
            }
        }
        return null;
    }

    public Product updaProductById2(Product request,int id){
        for(Product product : products){
            if(product.getId() == id){
                product.setName(request.getName());
                product.setCategory(request.getCategory());

                return product;
            }
        }

        return null;
    }

    public Product deleteProductById(int id){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId() == id){
                return products.remove(i);
            }
        }
        return null;
    }
    

}
