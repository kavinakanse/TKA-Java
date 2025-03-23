package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("20432")
	private int empId;
	@Value("Ram")
	private String ename;
	@Value("5LPA")
	private String salary;
	
	@Autowired
	private Country con;

	public Employee() {
		
	}

	public Employee(int empId, String ename, String salary, Country con) {
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.con = con;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + ", con=" + con + "]";
	}

}
