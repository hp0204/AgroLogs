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
@Table(name = "retailer_address")
public class RetailerAddress {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "address_id")
	    private Long address_id;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "retailer_id")
	    private Retailer retailer;

	    private String state;
	    private String city;
	    private int pincode;

    public RetailerAddress() {

    }
    
	public RetailerAddress(Long address_id, String state, String city, int pincode) {
		this.address_id = address_id;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Long getAddressId() {
		return address_id;
	}

	public void setAddressId(Long addressId) {
		this.address_id = addressId;
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
		return "RetailerAddress [addressId=" + address_id + ", state=" + state + ", city=" + city + ", pincode="
				+ pincode + "]";
	}

    

    
}
