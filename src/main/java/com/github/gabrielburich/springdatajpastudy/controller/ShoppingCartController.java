package com.github.gabrielburich.springdatajpastudy.controller;

import com.github.gabrielburich.springdatajpastudy.domain.Product;
import com.github.gabrielburich.springdatajpastudy.domain.ShoppingCart;
import com.github.gabrielburich.springdatajpastudy.service.ShoppingCartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping-carts")
public class ShoppingCartController {

    private final ShoppingCartService service;

    public ShoppingCartController(ShoppingCartService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ShoppingCart>> list() {
        var result = service.list();
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<ShoppingCart> add(@RequestBody ShoppingCart shoppingCart) {
        var result = service.add(shoppingCart);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}/products")
    public ResponseEntity<Long> addProduct(@PathVariable Long id, @RequestBody Product product) throws Exception {
        service.addProduct(id, product);
        return ResponseEntity.ok(id);
    }

}
