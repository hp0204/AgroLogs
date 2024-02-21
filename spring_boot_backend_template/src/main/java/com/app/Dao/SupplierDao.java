package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Supplier;

public interface SupplierDao extends JpaRepository<Supplier, Long>{

}
