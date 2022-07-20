package com.github.gabrielburich.springdatajpastudy.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDateTime lastUpdate;


    @OneToMany(mappedBy = "shoppingCart")
    private List<Product> products = new ArrayList<>();

}
