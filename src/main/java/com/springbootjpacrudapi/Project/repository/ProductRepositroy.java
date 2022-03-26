package com.springbootjpacrudapi.Project.repository;

import com.springbootjpacrudapi.Project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositroy extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
