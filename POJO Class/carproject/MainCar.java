package com.carproject;

public class MainCar {

	public static void main(String[] args) {
		Cars c = new Cars();
		c.setcId(101);
		c.setCompName("Mahindra");
		c.setModelName("Thar");
		c.setColour("Black");
		c.setSpeed(100);
		c.setPrice(1000000);
		System.out.println(c.getcId()+" "+c.getCompName()+" "+c.getModelName()+" "+c.getColour()+" "+c.getSpeed()+" "+c.getPrice());

	}

}
