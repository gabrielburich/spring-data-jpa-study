package com.github.gabrielburich.springdatajpastudy.controller;

import com.github.gabrielburich.springdatajpastudy.domain.User;
import com.github.gabrielburich.springdatajpastudy.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> list() {
        var users = service.list();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) throws Exception {
        var user = service.getById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        var result = service.add(user);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> add(@PathVariable Long id, @RequestBody User user) {
        var result = service.update(id, user);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok(id);
    }

}
