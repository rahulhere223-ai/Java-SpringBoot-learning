package com.example.backend.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Product {
    private int id;

    @NotBlank
    private String name;

    @Min(1)
    private int price;

    @NotBlank 
    private String category;

    private String internalcode;

    public String getInternalCode(){
        return internalcode;
    }
    public void setInternalCode(String internalcode){
        this.internalcode=internalcode;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }



}
