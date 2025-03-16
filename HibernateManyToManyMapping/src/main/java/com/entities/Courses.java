package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	private int cId;
	private String cName;
	
	@ManyToMany
	@JoinTable(name="Crs_Stud", 
				joinColumns = {@JoinColumn(name="cId")}, 
				inverseJoinColumns = {@JoinColumn(name="sId")} 
			)
	private List<Students> s;
	
	public Courses() {
		
	}

	public Courses(int cId, String cName, List<Students> s) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.s = s;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<Students> getS() {
		return s;
	}

	public void setS(List<Students> s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Courses [cId=" + cId + ", cName=" + cName + ", s=" + s + "]";
	}
	
	
	
}
