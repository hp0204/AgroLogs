package com.app.services;

import java.util.List;

import com.app.entities.RetailerAddress;


public interface RetailerAddressService {
	
	List<RetailerAddress> getAllRetailerAddress();
    RetailerAddress addRetailerAddress(RetailerAddress newRetailerAddress);
	String deleteRetailerAddressDetails(Long retailerAddressId);
	RetailerAddress getRetailerAddressDetails(Long retailerAddressId);
	RetailerAddress updateRetailerAddressDetails(RetailerAddress retailerAddress);
}
