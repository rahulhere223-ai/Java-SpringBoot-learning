package com.example.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.backend.dto.ProductRequest;
import com.example.backend.dto.ProductResponse;
import com.example.backend.model.Category;
import com.example.backend.model.Product;
import com.example.backend.repository.CategoryRepository;
import com.example.backend.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {


    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository,CategoryRepository categoryRepository){
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }

    public String getHello(){
        return "Hello from service";
    }
    public String getMsg(){
        return "Product request recieved by controller";
    }

    @Transactional
    public ProductResponse createProduct(ProductRequest request){
        Category category=categoryRepository.findByName(request.getCategory()).orElseGet(() -> {
            
            Category newCategory=new Category();
            newCategory.setName(request.getCategory());

            return categoryRepository.save(newCategory);
        });


        Product product=new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setCategory(category);

        Product savedProduct=productRepository.save(product);

        // throw new RuntimeException("Testing Transaction rollback...");

        return toResponse(savedProduct);
    }
    public ProductResponse getProductbyId(int id) {

      Optional<Product> product = productRepository.findById(id);

       if (product.isEmpty()) {
        return null;
       }

       return toResponse(product.get());
   }

    public List<ProductResponse> getAllProducts(){
        List<Product> products=productRepository.findAll();

        List<ProductResponse> responses=new ArrayList<>();

        for(Product product :products){
            responses.add(toResponse(product));
        }

        return responses;
    } 

    public int countofprod(){
        return (int)productRepository.count();
    }
    public ProductResponse getProductById(int id){
        Optional<Product> product=productRepository.findById(id);
        
        if(product.isEmpty()){
            return null;
        }

        return toResponse(product.get());
    }

    public ProductResponse updateproductById(int id,ProductRequest request){
        Optional<Product> optionalproduct=productRepository.findById(id);

        if(optionalproduct.isEmpty()){
            return null;
        }

        Product product=optionalproduct.get();

        product.setName(request.getName());
        product.setPrice(request.getPrice());

        Category category =new Category();
        category.setName(request.getCategory());

        Category savedCategory=categoryRepository.save(category);

        product.setCategory(savedCategory);

        Product savedProduct=productRepository.save(product);

        return toResponse(savedProduct);
    }
    public Product updateproductById2(int id,ProductRequest request){
        Optional<Product> optionalproduct=productRepository.findById(id);
        if(optionalproduct.isEmpty()){
            return null;
        }
        Product product=optionalproduct.get();
        product.setName(request.getName());

        Category category =new Category();
        category.setName(request.getCategory());

        Category savedCategory=categoryRepository.save(category);

        product.setCategory(savedCategory);
        product.setPrice(request.getPrice());

        Product savedproduct=productRepository.save(product);

        return savedproduct;
    }

    public Product deleteproductById(int id){
        Optional<Product> optionalproduct=productRepository.findById(id);
        if(optionalproduct.isEmpty()){
            return null;
        }

        Product product=optionalproduct.get();

        productRepository.deleteById(id);

        return product;
    }

   public ProductResponse toResponse(Product product){
        ProductResponse response=new ProductResponse();

        response.setId(product.getId());
        response.setName(product.getName());
        response.setPrice(product.getPrice());
        response.setCategory(product.getCategory().getName());

        return response;
    }
    public List<ProductResponse> getProductsByCategory(int categoryId){
        List<Product> products=productRepository.findByCategoryId(categoryId);

        List<ProductResponse> responses=new ArrayList<>();

        for(Product product : products){
            responses.add(toResponse(product));
        }
        return responses;
    }

    public List<ProductResponse> getProductByCategoryName(String categoryName){
        List<Product> products=productRepository.findProductsByCategory_Name(categoryName);

        List<ProductResponse> responses=new ArrayList<>();

        for(Product product: products){
            responses.add(toResponse(product));
        }

        return responses;
    }

    public List<ProductResponse> getProductsAbovePrice(int price){
        List<Product> products=productRepository.findProductsAbovePrice(price);

        List<ProductResponse> responses=new ArrayList<>();

        for(Product product : products){
            responses.add(toResponse(product));
        }

        return responses;
    }

    public List<ProductResponse> getProductByCategoryAndPrice(String CategoryName,int id){
        List<Product> products=productRepository.findByCategoryAndPrice(CategoryName, id);

        List<ProductResponse> responses=new ArrayList<>();

        for(Product product : products){
            responses.add(toResponse(product));
        }

        return responses;
    }

    public Page<ProductResponse> getproducts(Pageable pageable){
        Page<Product> products=productRepository.findAll(pageable);

        return products.map(this::toResponse);
    }

    public List<ProductResponse> getProductWithCatgeory(){
        List<Product> products=productRepository.getAllWithCategory();

        List<ProductResponse> responses=new ArrayList<>();

        for(Product product : products){
            responses.add(toResponse(product));
        }

        return responses;
    }
    public List<ProductResponse> findProductsasDTO(){
        return productRepository.findProductsasDTO();
    }


}
