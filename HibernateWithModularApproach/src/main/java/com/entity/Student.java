package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentRecord")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	private String name; 
	private String course;
	private int marks;
	
	@Column(name = "Address")
	private String city;
	private long contact;
	public Student() {
		
	}
	public Student(int sId, String name, String course, int marks, String city, long contact) {
		super();
		this.sId = sId;
		this.name = name;
		this.course = course;
		this.marks = marks;
		this.city = city;
		this.contact = contact;
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId +", Name=" + name + ", course=" + course + ", marks=" + marks + ", city=" + city + ", contact="
				+ contact + "]";
	}
	
	
	
	
}
