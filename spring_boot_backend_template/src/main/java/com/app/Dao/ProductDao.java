package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Products;

public interface ProductDao extends JpaRepository<Products, Long> {

}
