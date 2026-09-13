package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Product {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;
    
    @Min(1)
    private int price;
    
    @JsonIgnore 
    @ManyToOne
    @JoinColumn(name = "category_id")     
    private Category category;

    private String internalcode;

    public void setInternalCode(String internalcode){
        this.internalcode=internalcode;
    }
    public String getInternalCode(){
        return internalcode;
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

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category=category;
    }
    
    

}
