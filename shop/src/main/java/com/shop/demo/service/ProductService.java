package com.shop.demo.service;

import com.shop.demo.model.Product;
import com.shop.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public Product create(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> findById(long productId) {
        return productRepository.findById(productId);
    }

    public String deleteById(long productId){
        productRepository.deleteById(productId);
        return "Product number:" + productId + "has been deleted!";
    }

    public Product changeById(long productId, Product product) throws Exception{
        return productRepository.findById(productId)
                .map(products-> {
                    products.setProductId(product.getProductId());
                    products.setProductName(product.getProductName());
                    products.setDescription(product.getDescription());
                    products.setCPU(product.getCPU());
                    products.setRAM(product.getRAM());
                    products.setStorageDevice(product.getStorageDevice());
                    products.setScreen(product.getScreen());
                    products.setPrice(product.getPrice());
                    products.setQuantity(product.getQuantity());
                    products.setCategoriesId(product.getCategoriesId());
                    products.setOfCreation(product.getOfCreation());
               return productRepository.save(products);
                }).orElseThrow(Exception::new);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }
}