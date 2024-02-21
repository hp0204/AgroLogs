package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.SupplierAddressDao;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.SupplierAddress;

@Service
@Transactional
public class SupplierAddressServiceImpl implements SupplierAddressService {

	@Autowired
	private SupplierAddressDao supplierAddressDao;
	
	@Override
	public List<SupplierAddress> getAllSupplierAddress() {
		return supplierAddressDao.findAll();
	}

	@Override
	public SupplierAddress addSupplierAddress(SupplierAddress newSupplierAddress) {
		
		return supplierAddressDao.save(newSupplierAddress);
	}

	@Override
	public String deleteSupplierAddressDetails(Long supplierAddressId) {
		if(supplierAddressDao.existsById(supplierAddressId)) {
			supplierAddressDao.deleteById(supplierAddressId);
			return "deleted supplierAddress details ";
		}
		return "Invalid supplierAddressId...";
	}

	@Override
	public SupplierAddress getSupplierAddressDetails(Long supplierAddressId) {
		return supplierAddressDao.findById(supplierAddressId).orElseThrow(()->
		new ResourceNotFoundException("Invalid supplierAddress id.."));
	}

	@Override
	public SupplierAddress updateSupplierAddressDetails(SupplierAddress supplierAddress) {
		return supplierAddressDao.save(supplierAddress);
	}

}
