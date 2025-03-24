package com.entities;

import org.springframework.stereotype.Component;

@Component("dell")
public class Dell implements Laptop {

	@Override
	public String price() {
		return "Dell Price: 65k";
	}

}
