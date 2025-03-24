package com.entities;

import org.springframework.stereotype.Component;

@Component("hp")
public class Hp implements Laptop{

	@Override
	public String price() {
		return "Hp Price: 50k";
	}
	
	
}
