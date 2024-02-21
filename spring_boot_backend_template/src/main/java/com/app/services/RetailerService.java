package com.app.services;

import java.util.List;

import com.app.entities.Retailer;

public interface RetailerService {
	
	
	List<Retailer> getAllRetailers();
	Retailer addRetailer(Retailer newRetailer);
	String deleteRetailerDetails(Long retailerId);
	Retailer getRetailerDetails(Long retailerId);
	Retailer updateRetailerDetails(Retailer retailer);


}
