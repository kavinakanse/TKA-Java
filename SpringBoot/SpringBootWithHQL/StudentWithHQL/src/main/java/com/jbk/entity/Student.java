package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity	//marks class as a entity class
public class Student {

	@Id	//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//auto-increment
	private int studId;
	private String name;
	private String course;
	private String marks;

	public Student() {
		
	}

	public Student(int studId, String name, String course, String marks) {
		this.studId = studId;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
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

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}

}
