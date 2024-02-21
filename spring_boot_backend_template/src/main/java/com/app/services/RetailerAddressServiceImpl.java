package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.RetailerAddressDao;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.RetailerAddress;

@Service
@Transactional
public class RetailerAddressServiceImpl implements RetailerAddressService {

	@Autowired
	private RetailerAddressDao retailerAddressDao;
	
	@Override
	public List<RetailerAddress> getAllRetailerAddress() {
		return retailerAddressDao.findAll();
	}

	@Override
	public RetailerAddress addRetailerAddress(RetailerAddress newRetailerAddress) {
		return retailerAddressDao.save(newRetailerAddress);
	}

	@Override
	public String deleteRetailerAddressDetails(Long retailerAddressId) {
		if(retailerAddressDao.existsById(retailerAddressId)) {
			retailerAddressDao.deleteById(retailerAddressId);
			return "deleted retailerAddress details ";
		}
		return "Invalid retailerId...";
	}

	@Override
	public RetailerAddress getRetailerAddressDetails(Long retailerAddressId) {
		return retailerAddressDao.findById(retailerAddressId).orElseThrow(()->
		new ResourceNotFoundException("Invalid retailerAddressId id.."));
	}

	@Override
	public RetailerAddress updateRetailerAddressDetails(RetailerAddress retailerAddress) {
		return retailerAddressDao.save(retailerAddress);
	}

}
