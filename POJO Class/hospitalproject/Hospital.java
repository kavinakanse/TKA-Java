package com.hospitalproject;

public class Hospital {
	private int pId;
	private String name;
	private int age;
	private double weight;
	private long contact;
	private String address;
	
	//no arg constructor
	public Hospital() {
		
	}
	
	//with arg constructor
	public Hospital(int pId, String name, int age, double weight, long contact, String address) {
		super();
		this.pId = pId;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.contact = contact;
		this.address = address;
	}
	
	//getter and setter 
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Hospital [pId=" + pId + ", name=" + name + ", age=" + age + ", weight=" + weight + ", contact="
				+ contact + ", address=" + address + "]";
	}
	
	
}
