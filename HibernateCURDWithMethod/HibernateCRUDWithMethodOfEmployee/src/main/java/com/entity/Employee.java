package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity		//create table 
@Table(name = "EmployeeRecord")		//rename table
public class Employee {
	
	//fields
	@Id	// create primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//Auto-increment
	private int empId;
	private String name;
	private int age;
	private String maritalStatus;
	
	@Column(name = "designation")	//rename column
	private String role;
	private int salary;
	private int experience;
	
	//no argument constructor
	public Employee() {

	}
	
	//with argument constructor
	public Employee(int empId, String name, int age, String maritalStatus, String role, int salary, int experience) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.role = role;
		this.salary = salary;
		this.experience = experience;
	}
	
	//getter and setter
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", maritalStatus=" + maritalStatus
				+ ", role=" + role + ", salary=" + salary + ", experience=" + experience + "]";
	}
}
