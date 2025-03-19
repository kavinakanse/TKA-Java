package com.entity;

public class Student {
	private int sid;
	private String sname;
	private String city;
	private College clg;
	public Student() {
		
	}
	public Student(int sid, String sname, String city, College clg) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.clg = clg;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", clg=" + clg + "]";
	}
	
	
}
