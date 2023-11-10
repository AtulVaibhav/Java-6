package com.learning.SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.SpringBoot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
