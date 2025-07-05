package com.vishal.FirstWebApp.controller;

import com.vishal.FirstWebApp.model.Product;
import com.vishal.FirstWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/product")
    public List<Product> allProducts()
    {
        return service.getAllProducts();
    }

    @GetMapping("/product/{productId}")
    public Product getProductByID(@PathVariable int productId)
    {
        return service.getProductById(productId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @PutMapping("/product")
    public void updateProductByID(@RequestBody Product product)
    {
        service.updateProductByID(product);
    }

    @DeleteMapping("/product/{productId}")
    public void deleteProductById(@PathVariable int productId)
    {
        service.deleteProductById(productId);
    }
}
