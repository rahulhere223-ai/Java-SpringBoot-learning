package com.example.backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductRequest {
    
    @NotBlank
    private String name;

    @Min(1)
    private int price;

    @NotBlank
    private String category;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public String getCategory(){
        return category;
    }
}
