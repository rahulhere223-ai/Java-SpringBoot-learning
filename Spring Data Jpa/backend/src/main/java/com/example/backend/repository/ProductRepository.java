package com.example.backend.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.backend.dto.ProductResponse;
import com.example.backend.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    
    List<Product> findByCategoryId(int categoryId);
    
    List<Product> findProductsByCategory_Name(String categoryName);

    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findProductsAbovePrice(@Param("price") int price);

    @Query("SELECT p FROM Product p WHERE p.category.name = :categoryName  AND p.price > :price")
    List<Product> findByCategoryAndPrice(@Param("categoryName") String categoryName ,@Param("price") int id);
 
    @Query("SELECT p FROM Product p JOIN FETCH p.category")
    List<Product> getAllWithCategory();

    @Query("SELECT new com.example.backend.dto.ProductResponse(p.id,p.name,p.price,p.category.name) FROM Product p")
    List<ProductResponse> findProductsasDTO();         
}
