// package com.example.backend;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;

// // @RestController
// public class HelloController {

//     // @GetMapping("/hello")
//     // public String hello(){
//     //     return "Welcome to my backend";
//     // }

//     @GetMapping("/about")
//     public String about(){
//         return "I am learning java springboot";
//     }

//     @GetMapping("/name")
//     public String name(){
//         return "Rahul kumar yadav";
//     }

//     // @GetMapping("/users/{id}")
//     // public String getUser(@PathVariable int id){
//     //     return "user id is" + id;
//     // }

//     // @GetMapping("/products/{id}")
//     // public String getProduct(@PathVariable int id){
//     //     return "Product id is " + id;
//     // }

//     // @GetMapping("/products")
//     // public String getProduct(@RequestParam String category){
//     //     return "Products category is "+ category;
//     // }

//     // @PostMapping("/products")
//     // public Product createProduct(@RequestBody Product product){
//     //     return product;
//     // }
//     // @PostMapping("/products")
//     // public String createProduct(@RequestBody Product product){
//     //     return "Product " + product.getName() +" is added successfully";
//     // }

//     @GetMapping("/products/{id}/details")
//     public String getProduct(@PathVariable int id,@RequestParam String category){ 
//         return "Product with " + id + "belong to category " + category;
//     }

// }
