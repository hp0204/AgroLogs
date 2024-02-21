package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.SupplierDao;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Supplier;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierDao supplierDao;
	
	@Override
	public List<Supplier> getAllSuppliers() {
		return supplierDao.findAll();
	}

	@Override
	public Supplier addSupplier(Supplier newSupplier) {
		return supplierDao.save(newSupplier);
	}

	@Override
	public String deleteSupplierDetails(Long supplierId) {
		if(supplierDao.existsById(supplierId)) {
			supplierDao.deleteById(supplierId);
			return "deleted supplier details ";
		}
		return "Invalid supplierId...";
	}

	@Override
	public Supplier getSupplierDetails(Long supplierId) {
		return supplierDao.findById(supplierId).orElseThrow(()->
		new ResourceNotFoundException("Invalid supplier id.."));
	}

	@Override
	public Supplier updateSupplierDetails(Supplier supplier) {
		return supplierDao.save(supplier);
	}

}
