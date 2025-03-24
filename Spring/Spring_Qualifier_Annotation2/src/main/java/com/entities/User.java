package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Qualifier("hp")
	@Autowired
	private Laptop lp1;

	@Qualifier("dell")
	@Autowired
	private Laptop lp2;
	
	@Qualifier("lenova")
	@Autowired
	private Laptop lp3;

	public User() {

	}

	public User(Laptop lp1, Laptop lp2, Laptop lp3) {
		super();
		this.lp1 = lp1;
		this.lp2 = lp2;
		this.lp3 = lp3;
	}

	public Laptop getLp1() {
		return lp1;
	}

	public void setLp1(Laptop lp1) {
		this.lp1 = lp1;
	}

	public Laptop getLp2() {
		return lp2;
	}

	public void setLp2(Laptop lp2) {
		this.lp2 = lp2;
	}

	public Laptop getLp3() {
		return lp3;
	}

	public void setLp3(Laptop lp3) {
		this.lp3 = lp3;
	}

	@Override
	public String toString() {
		return "User [lp1=" + lp1 + ", lp2=" + lp2 + ", lp3=" + lp3 + "]";
	}

}
