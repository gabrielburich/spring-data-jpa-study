package com.github.gabrielburich.springdatajpastudy.service;

import com.github.gabrielburich.springdatajpastudy.domain.Product;
import com.github.gabrielburich.springdatajpastudy.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> list() {
        return repository.findAll();
    }

    public Product add(Product product) {
        return repository.save(product);
    }

}
