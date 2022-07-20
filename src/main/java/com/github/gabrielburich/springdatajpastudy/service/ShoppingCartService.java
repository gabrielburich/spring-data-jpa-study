package com.github.gabrielburich.springdatajpastudy.service;

import com.github.gabrielburich.springdatajpastudy.domain.Product;
import com.github.gabrielburich.springdatajpastudy.domain.ShoppingCart;
import com.github.gabrielburich.springdatajpastudy.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ShoppingCartService {

    private final ShoppingCartRepository repository;

    private final ProductService productService;

    public ShoppingCartService(ShoppingCartRepository repository, ProductService productService) {
        this.repository = repository;
        this.productService = productService;
    }

    public List<ShoppingCart> list() {
        return repository.findAll();
    }

    public ShoppingCart getById(Long id) throws Exception {
        return repository.findById(id)
                .orElseThrow(() -> new Exception("Not found a shopping cart with the ID: " + id));
    }

    public ShoppingCart add(ShoppingCart product) {
        product.setLastUpdate(LocalDateTime.now());
        return repository.save(product);
    }

    public ShoppingCart update(Long id, ShoppingCart product) {
        product.setId(id);
        product.setLastUpdate(LocalDateTime.now());
        return repository.save(product);
    }

    public void addProduct(Long id, Product product) throws Exception {
        var shoppingCart = getById(id);
        product.setShoppingCart(shoppingCart);
        productService.add(product);
    }

}
