package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {
	
	@Id
	private int studId;
	private String sname;
	private String city;
	
	@ManyToMany
	@JoinTable(name="Stud_Crs", 
				joinColumns = {@JoinColumn(name="sId")}, 
				inverseJoinColumns = {@JoinColumn(name="cId")}
				)	
	private List<Courses> crs;

	public Students() {
		
	}

	public Students(int studId, String sname, String city, List<Courses> crs) {
		super();
		this.studId = studId;
		this.sname = sname;
		this.city = city;
		this.crs = crs;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
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

	public List<Courses> getCrs() {
		return crs;
	}

	public void setCrs(List<Courses> crs) {
		this.crs = crs;
	}

	@Override
	public String toString() {
		return "Students [studId=" + studId + ", sname=" + sname + ", city=" + city + ", crs=" + crs + "]";
	}
	
	
	
}
