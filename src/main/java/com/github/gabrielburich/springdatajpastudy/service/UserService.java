package com.github.gabrielburich.springdatajpastudy.service;

import com.github.gabrielburich.springdatajpastudy.domain.User;
import com.github.gabrielburich.springdatajpastudy.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> list() {
        return repository.findAll();
    }

    public User getById(Long id) throws Exception {
        return repository.findById(id)
                .orElseThrow(() -> new Exception("Not found a user with the ID: " + id));
    }

    public User add(User user) {
        return repository.save(user);
    }

    public User update(Long id, User user) {
        user.setId(id);
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
