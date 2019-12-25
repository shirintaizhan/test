package com.shop.demo.controller;


import com.shop.demo.model.Product;
import com.shop.demo.repository.ProductRepository;
import com.shop.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/{productId}")
    public Product save(@PathVariable("productId") Product product){
        return productService.create(product);
    }

    @GetMapping("/{productId}")
    public Optional<Product> view (@PathVariable("productId") long productId){
        return productService.findById(productId);
    }

    @PutMapping("/{productId}")
    public Product update(@PathVariable("productId") long productId, Product product) throws Exception {
        return productService.changeById(productId,product);
    }

    @GetMapping ("/list")
    public List<Product> list (){
         return productService.getAll();
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") long productId){
        return productService.deleteById(productId);
    }
}