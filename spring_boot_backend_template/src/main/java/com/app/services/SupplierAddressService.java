package com.app.services;

import java.util.List;

import com.app.entities.SupplierAddress;


public interface SupplierAddressService {

	List<SupplierAddress> getAllSupplierAddress();
	SupplierAddress addSupplierAddress(SupplierAddress newSupplierAddress);
	String deleteSupplierAddressDetails(Long supplierAddressId);
	SupplierAddress getSupplierAddressDetails(Long supplierAddressId);
	SupplierAddress updateSupplierAddressDetails(SupplierAddress supplierAddress);
}
