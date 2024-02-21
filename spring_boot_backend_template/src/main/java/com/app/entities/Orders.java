package com.app.entities;

import java.time.LocalDate;

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
@Table(name="orders")
public class Orders  {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "order_id")
	    private Long order_id;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "retailer_id")
	    private Retailer retailer;

	    @Column(name = "quantity")
	    private int quantity;

	    @Column(name = "order_date")
	    private LocalDate orderDate;
	    
	    
	    @Column(name = "price")
	    private double price;


		public Orders() {
			
		}


		public Orders(Long order_id, Retailer retailer, int quantity, LocalDate orderDate, double price) {
			super();
			this.order_id = order_id;
			this.retailer = retailer;
			this.quantity = quantity;
			this.orderDate = orderDate;
			this.price = price;
		}


		public Long getOrder_id() {
			return order_id;
		}


		public void setOrder_id(Long order_id) {
			this.order_id = order_id;
		}


		public Retailer getRetailer() {
			return retailer;
		}


		public void setRetailer(Retailer retailer) {
			this.retailer = retailer;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}


		public LocalDate getOrderDate() {
			return orderDate;
		}


		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		@Override
		public String toString() {
			return "Orders [order_id=" + order_id + ", retailer=" + retailer + ", quantity=" + quantity + ", orderDate="
					+ orderDate + ", price=" + price + "]";
		}


		
}
