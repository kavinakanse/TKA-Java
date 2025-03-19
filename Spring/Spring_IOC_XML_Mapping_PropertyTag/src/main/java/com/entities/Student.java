package com.entities;

public class Student {

	private int sId;
	private String sName;
	private String city;
	private Course crs;
	
	public Student() {

	}
	
	public Student(int sId, String sName, String city, Course crs) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.city = city;
		this.crs = crs;
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Course getCrs() {
		return crs;
	}
	public void setCrs(Course crs) {
		this.crs = crs;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", city=" + city + ", crs=" + crs + "]";
	}
	
	
}
