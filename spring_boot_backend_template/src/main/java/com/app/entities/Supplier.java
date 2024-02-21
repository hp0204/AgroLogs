package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier{
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "supplier_id")
	    private Long supplier_id;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "mobile")
	    private Long mobile;
	    
	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "password")
	    private String password;
	    
	    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
	    private List<SupplierAddress> addresses;


	public Supplier() {
		
	}


	public Supplier(Long supplier_id, String name, Long mobile, String email, String password,
			List<SupplierAddress> addresses) {
		super();
		this.supplier_id = supplier_id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.addresses = addresses;
	}


	public Long getSupplier_id() {
		return supplier_id;
	}


	public void setSupplier_id(Long supplier_id) {
		this.supplier_id = supplier_id;
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


	public List<SupplierAddress> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<SupplierAddress> addresses) {
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return "Supplier [supplier_id=" + supplier_id + ", name=" + name + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + ", addresses=" + addresses + "]";
	}
	
	
	
}
