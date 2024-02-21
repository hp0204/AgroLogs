package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="retailer")
public class Retailer {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "retailer_id")
	    private Long retailer_id;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "mobile")
	    private Long mobile;
	    
	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "password")
	    private String password;
	    
	    @OneToMany(mappedBy = "retailer", cascade = CascadeType.ALL)
	    private List<RetailerAddress> addresses;


	public Retailer() {
		
	}


	public Retailer(Long retailer_id, String name, Long mobile, String email, String password,
			List<RetailerAddress> addresses) {
		super();
		this.retailer_id = retailer_id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.addresses = addresses;
	}


	public Long getRetailer_id() {
		return retailer_id;
	}


	public void setRetailer_id(Long retailer_id) {
		this.retailer_id = retailer_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getMobile() {
		return mobile;
	}


	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<RetailerAddress> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<RetailerAddress> addresses) {
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return "Retailer [retailer_id=" + retailer_id + ", name=" + name + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + ", addresses=" + addresses + "]";
	}
	
}
