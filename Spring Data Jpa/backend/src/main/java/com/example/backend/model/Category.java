package com.example.backend.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id; 
    
    @Column(unique=true, nullable=false)
    private String name;
    
    @OneToMany(mappedBy="category")
    private List<Product> products;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public List<Product> getProduct(){
        return products;
    }
    public void setProduct(List<Product> products){
        this.products=products;
    }


}
