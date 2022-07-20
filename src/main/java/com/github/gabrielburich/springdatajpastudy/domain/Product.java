package com.github.gabrielburich.springdatajpastudy.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 75, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "shopping_cart_id")
    @JsonProperty(access = WRITE_ONLY)
    private ShoppingCart shoppingCart;

}
