package com.springbootjpacrudapi.Project.service;

import com.springbootjpacrudapi.Project.entity.Product;
import com.springbootjpacrudapi.Project.repository.ProductRepositroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepositroy productRepositroy;


    public Product save(Product product){
        return productRepositroy.save(product);
    }

    public List<Product> saves(List<Product> products){
        return productRepositroy.saveAll(products);
    }

    public List<Product> products() {
        return productRepositroy.findAll();
    }

    public Product findId(int id){
        return productRepositroy.findById(id).orElse(null);
    }

    public Product findName(String name){
        return productRepositroy.findByName(name);
    }

    public String delete(int id){
        productRepositroy.deleteById(id);
        return "Müşteri Silindi !!" + id;
    }
    public Product update(Product product){
        Product updateProduct = productRepositroy.findById(product.getId()).orElse(null);
        updateProduct.setName(product.getName());
        updateProduct.setSurname(product.getSurname());
        updateProduct.setQuantity(product.getQuantity());
        updateProduct.setPrice(product.getPrice());
        return productRepositroy.save(updateProduct);
    }

}
