package com.example.backend.dto;

public class ProductResponse {
    private int id;
    private String name;
    private int price;
    private String category;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
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
