package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.SupplierAddress;

public interface SupplierAddressDao extends JpaRepository<SupplierAddress, Long> {

}
