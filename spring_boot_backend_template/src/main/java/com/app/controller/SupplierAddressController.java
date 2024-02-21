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

import com.app.entities.Supplier;
import com.app.entities.SupplierAddress;
import com.app.services.SupplierAddressService;


@RestController
@RequestMapping("/supplierAddress")
public class SupplierAddressController {

	@Autowired
	private SupplierAddressService supplierAddressService;
	
	@GetMapping
	public List<SupplierAddress> getAllSupplierAddress(){
		System.out.println("in list get all Supplier Address details");
		return supplierAddressService.getAllSupplierAddress();
	}
	
	//Add new Supplier Address
	
	@PostMapping("/addNewSupplierAddress")
	public SupplierAddress addNewSupplierAddress(@RequestBody SupplierAddress newSupplierAddress) {
		System.out.println(newSupplierAddress);
		return supplierAddressService.addSupplierAddress(newSupplierAddress);	
	}
	
	@PutMapping
	public SupplierAddress updateSupplierAddressDetails(@RequestBody SupplierAddress supplierAddress) {
	    return supplierAddressService.updateSupplierAddressDetails(supplierAddress);	
	}
	
	@DeleteMapping("/{supplierAddressId}")
	public String deleteSupplierAddressDetails(@PathVariable Long supplierAddressId) {
		return supplierAddressService.deleteSupplierAddressDetails(supplierAddressId);
	}
	
	@GetMapping("/{supplierAddressId}")
	public SupplierAddress getSupplierAddressDetails( @PathVariable Long supplierAddressId) {
		return supplierAddressService.getSupplierAddressDetails(supplierAddressId);
	}
	
	
}
