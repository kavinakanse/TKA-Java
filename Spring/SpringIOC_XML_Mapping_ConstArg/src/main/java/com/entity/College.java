package com.entity;

public class College {
	private int cId;
	private String cname;
	public College() {
		
	}
	public College(int cId, String cname) {
		super();
		this.cId = cId;
		this.cname = cname;
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
	@Override
	public String toString() {
		return "College [cId=" + cId + ", cname=" + cname + "]";
	}
	
	
}
