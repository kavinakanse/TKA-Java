package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String uName;
	private String city;
	
	@OneToOne
	private Bike b;

	//no arg constructor
	public User() {
		
	}

	//arg constructor
	public User(int uId, String uName, String city, Bike b) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.city = city;
		this.b = b;
	}

	//getter and setter method
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Bike getB() {
		return b;
	}

	public void setB(Bike b) {
		this.b = b;
	}

	//toString method
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", city=" + city + ", b=" + b + "]";
	}
	
}
