package com.github.gabrielburich.springdatajpastudy.repository;

import com.github.gabrielburich.springdatajpastudy.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {}
