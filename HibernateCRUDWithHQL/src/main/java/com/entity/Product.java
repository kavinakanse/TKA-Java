package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String name;
	private int price;
	private int quantity;
	private String color;
	
	public Product() {
		
	}
	
	public Product(int pId, String name, int price, int quantity, String color) {
		super();
		this.pId = pId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", color="
				+ color + "]";
	}
	
	
	
}
