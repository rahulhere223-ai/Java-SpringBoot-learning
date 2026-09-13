package com.example.backend.dto;

public class ProductResponse {

    private int id;
    private String name;
    private int price;
    private String category;

    public ProductResponse(){

    }
    public ProductResponse(int id,String name,int price,String category){
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
    }


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
