package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="supplier_address")
public class SupplierAddress{

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "address_id")
	    private Long address_id;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "supplier_id")
	    private Supplier supplier;

	    private String state;
	    private String city;
	    private int pincode;
	
	public SupplierAddress() {
		
	}
	
	public SupplierAddress(Long address_id, String state, String city, int pincode) {
		
		this.address_id = address_id;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "SupplierAddress [address_id=" + address_id + ", state=" + state + ", city=" + city + ", pincode="
				+ pincode + "]";
	}

	
	
}
