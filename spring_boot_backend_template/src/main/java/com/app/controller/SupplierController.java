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
import com.app.services.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;
	
	@GetMapping
	public List<Supplier> getAllSupplier(){
		System.out.println("in list get all Supplier details");
		return supplierService.getAllSuppliers();
	}
	
	//Add new Supplier
	
	@PostMapping("/addNewSupplier")
	public Supplier addNewSupplier(@RequestBody Supplier newSupplier) {
		System.out.println(newSupplier);
		return supplierService.addSupplier(newSupplier);	
	}
	
	@PutMapping
	public Supplier updateSupplierDetails(@RequestBody Supplier supplier) {
	    return supplierService.updateSupplierDetails(supplier);	
	}
	
	@DeleteMapping("/{supplierId}")
	public String deleteSupplierDetails(@PathVariable Long supplierId) {
		return supplierService.deleteSupplierDetails(supplierId);
	}
	
	@GetMapping("/{supplierId}")
	public Supplier getSupplierDetails( @PathVariable Long supplierId) {
		return supplierService.getSupplierDetails(supplierId);
	}
}
