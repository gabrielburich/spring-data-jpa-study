package com.github.gabrielburich.springdatajpastudy.repository;

import com.github.gabrielburich.springdatajpastudy.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
