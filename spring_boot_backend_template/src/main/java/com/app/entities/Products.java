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
@Table(name="products")
public class Products{

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "prod_id")
	    private Long prod_id;

	    @Column(name = "prod_name")
	    private String prod_name;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "price")
	    private double price;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "supp_id")
	    private Supplier supplier;

	public Products() {
		
	}

	public Products(Long prod_id, String prod_name, String description, double price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.description = description;
		this.price = price;
	}

	public Long getProd_id() {
		return prod_id;
	}

	public void setProd_id(Long prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [prod_id=" + prod_id + ", prod_name=" + prod_name + ", description=" + description + ", price="
				+ price + "]";
	}
	
	

}
