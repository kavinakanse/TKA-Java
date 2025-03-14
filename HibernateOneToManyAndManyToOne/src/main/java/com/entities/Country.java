package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Country {
	
	@Id
	private int cId;
	private String cname;
	
	@OneToMany
	private List<Employee> emp;

	public Country() {
		
	}

	public Country(int cId, String cname, List<Employee> emp) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.emp = emp;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Country [cId=" + cId + ", cname=" + cname + ", emp=" + emp + "]";
	}

}
