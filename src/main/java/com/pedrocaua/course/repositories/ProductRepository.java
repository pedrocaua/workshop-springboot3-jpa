package com.pedrocaua.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocaua.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
