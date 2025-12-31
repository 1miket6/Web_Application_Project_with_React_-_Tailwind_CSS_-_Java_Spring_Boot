package com.mike.stickers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mike.stickers.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{ //primary key
//implement all the abstract methods from JpaRepository
}
