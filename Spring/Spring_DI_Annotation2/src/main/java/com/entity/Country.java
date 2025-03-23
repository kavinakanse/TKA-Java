package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("123")
	private int cId;
	@Value("India")
	private String cName;

	public Country() {
		
	}

	public Country(int cId, String cName) {
		this.cId = cId;
		this.cName = cName;
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

	@Override
	public String toString() {
		return "Country [cId=" + cId + ", cName=" + cName + "]";
	}

}
