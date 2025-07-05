package com.vishal.FirstWebApp.service;

import com.vishal.FirstWebApp.model.Product;
import com.vishal.FirstWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class ProductService {

    @Autowired
    ProductRepository repo;

    // Method 1
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    //get product with given id
    public Product getProductById(int productId) {
        return repo.findById(productId).orElse(null);
    }

    //Add the product sent by Controller to the list
    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProductByID(Product product) {
        repo.save(product);
    }

    public void deleteProductById(int productId) {
        repo.deleteById(productId);
    }
}