package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Retailer;
import com.app.services.RetailerService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/retailers")
public class RetailerController {

	@Autowired
	private RetailerService retailerService;
	
	@GetMapping
	public List<Retailer> getAllRetailers(){
		System.out.println("in list get all retailer details");
		return retailerService.getAllRetailers();
	}
	
	//Add new Retailer
	
	@PostMapping("/addNewRetailer")
	public Retailer addNewRetailer(@RequestBody Retailer newRetailer) {
		System.out.println(newRetailer);
		return retailerService.addRetailer(newRetailer);	
	}
	
	@PutMapping
	public Retailer updateRetailerDetails(@RequestBody Retailer retailer) {
	    return retailerService.updateRetailerDetails(retailer);	
	}
	
	@DeleteMapping("/{retailerId}")
	public String deleteRetailerDetails(@PathVariable Long retailerId) {
		return retailerService.deleteRetailerDetails(retailerId);
	}
	
	@GetMapping("/{retailerId}")
	public Retailer getRetailerDetails( @PathVariable Long retailerId) {
		return retailerService.getRetailerDetails(retailerId);
	}
}
