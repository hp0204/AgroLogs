package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.RetailerAddress;
import com.app.services.RetailerAddressService;

@RestController
@RequestMapping("/retailerAddress")
public class RetailerAddressController {

	@Autowired
	private RetailerAddressService retailerAddressService;
	
	@GetMapping
	public List<RetailerAddress> getAllRetailerAddress(){
		System.out.println("in list get all Retailer Address details");
		return retailerAddressService.getAllRetailerAddress();
	}
	
	//Add new Retailer Address
	
	@PostMapping("/addNewRetailerAddress")
	public RetailerAddress addNewRetailerAddress(@RequestBody RetailerAddress newRetailerAddress) {
		System.out.println(newRetailerAddress);
		return retailerAddressService.addRetailerAddress(newRetailerAddress);	
	}
	
	@PutMapping
	public RetailerAddress updateRetailerAddressDetails(@RequestBody RetailerAddress retailerAddress) {
	    return retailerAddressService.updateRetailerAddressDetails(retailerAddress);	
	}
	
	@DeleteMapping("/{retailerAddressId}")
	public String deleteRetailerAddressDetails(@PathVariable Long retailerAddressId) {
		return retailerAddressService.deleteRetailerAddressDetails(retailerAddressId);
	}
	
	@GetMapping("/{retailerAddressId}")
	public RetailerAddress getRetailerAddressDetails( @PathVariable Long retailerAddressId) {
		return retailerAddressService.getRetailerAddressDetails(retailerAddressId);
	}
	
	
}
