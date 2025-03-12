package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	//fields
	@Id
	private int bId;
	private String bName;
	
	//no arg constructor
	public Bike() {
		
	}
	
	//arg constructor
	public Bike(int bId, String bName) {
		super();
		this.bId = bId;
		this.bName = bName;
	}
	
	//getter and setter method
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Bike [bId=" + bId + ", bName=" + bName + "]";
	}
	
	
}
