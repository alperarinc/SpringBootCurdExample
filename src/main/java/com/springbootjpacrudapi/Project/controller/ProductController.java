package com.springbootjpacrudapi.Project.controller;

import com.springbootjpacrudapi.Project.entity.Product;
import com.springbootjpacrudapi.Project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        return productService.save(product);
    }

    @PostMapping("/adds")
    public List<Product> adds(@RequestBody List<Product> products){
        return productService.saves(products);
    }

    @GetMapping("/products")
    public List<Product> find(){
        return productService.products();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable int id){
        return productService.findId(id);
    }

    @GetMapping("/products/{name}")
    public Product findByName(@PathVariable String name){
        return productService.findName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.update(product);
    }
    @DeleteMapping("delete")
    public String deleteProduct(@PathVariable int id){
        return productService.delete(id);
    }
}
