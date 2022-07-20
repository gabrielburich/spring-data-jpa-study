package com.github.gabrielburich.springdatajpastudy.controller;

import com.github.gabrielburich.springdatajpastudy.domain.Product;
import com.github.gabrielburich.springdatajpastudy.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Product>> list() {
        var result = service.list();
        return ResponseEntity.ok(result);
    }

}
