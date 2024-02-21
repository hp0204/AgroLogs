package com.app.services;

import java.util.List;

import com.app.entities.Supplier;


public interface SupplierService {

	List<Supplier> getAllSuppliers();
	Supplier addSupplier(Supplier newSupplier);
	String deleteSupplierDetails(Long supplierId);
	Supplier getSupplierDetails(Long supplierId);
	Supplier updateSupplierDetails(Supplier supplier);
}
