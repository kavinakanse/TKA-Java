package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component() //creates beans
public class Car {
	
	@Value("2203")	//sets value to fields
	private int cId;
	@Value("Venue")
	private String cName;
	@Value("White")
	private String color;
	@Value("18LPA")
	private String price;
	
	public Car() {
		
	}
	
	public Car(int cId, String cName, String color, String price) {
		this.cId = cId;
		this.cName = cName;
		this.color = color;
		this.price = price;
	}
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [cId=" + cId + ", cName=" + cName + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
