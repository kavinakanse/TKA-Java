package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobileInfo")
public class Mobile {
	
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mId;
	private String compName;
	private String modelName;
	private String colour;
	
	@Column(name = "cost")
	private int price;
	
	//no arg constructor
	public Mobile() {
		
	}
	
	//arg constructor
	public Mobile(int mId, String compName, String modelName, String colour, int price) {
		super();
		this.mId = mId;
		this.compName = compName;
		this.modelName = modelName;
		this.colour = colour;
		this.price = price;
	}
	
	//getter and setter method
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Mobile [mId=" + mId + ", compName=" + compName + ", modelName=" + modelName + ", colour=" + colour
				+ ", price=" + price + "]";
	}
	
	
	
	
}
