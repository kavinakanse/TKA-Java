package com.entities;

import org.springframework.stereotype.Component;

@Component("lenova")
public class Lenova implements Laptop {

	@Override
	public String price() {
		return "Lenova price: 55k";
	}

}
