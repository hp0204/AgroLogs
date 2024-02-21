package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.RetailerDao;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Retailer;

@Service
@Transactional
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	private RetailerDao retailerDao;

	@Override
	public List<Retailer> getAllRetailers() {
		return retailerDao.findAll();
	}

	@Override
	public Retailer addRetailer(Retailer newRetailer) {
		return retailerDao.save(newRetailer) ;
	}

	@Override
	public String deleteRetailerDetails(Long retailerId) {
		if(retailerDao.existsById(retailerId)) {
			retailerDao.deleteById(retailerId);
			return "deleted retailer details ";
		}
		return "Invalid reatilerId...";
	}

	@Override
	public Retailer getRetailerDetails(Long retailerId) {
		return retailerDao.findById(retailerId).orElseThrow(()->
		new ResourceNotFoundException("Invalid retailer id.."));
	}

	@Override
	public Retailer updateRetailerDetails(Retailer retailer) {
		return retailerDao.save(retailer);
	}


}
