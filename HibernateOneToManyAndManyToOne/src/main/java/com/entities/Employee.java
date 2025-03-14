package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	private int eId;
	private String ename;
	private String city;
	
	@ManyToOne
	@JoinColumn(name = "FK")
	private Country c;

	public Employee() {
		
	}

	public Employee(int eId, String ename, String city, Country c) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.city = city;
		this.c = c;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getC() {
		return c;
	}

	public void setC(Country c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ename=" + ename + ", city=" + city + ", c=" + c + "]";
	}

	
	
}
