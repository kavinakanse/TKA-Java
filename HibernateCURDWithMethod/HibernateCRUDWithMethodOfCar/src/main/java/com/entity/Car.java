package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	//create table
@Table(name = "CarInfo")	//change table name
public class Car {
	// fields
	@Id	//create primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//Auto-increment
	private int cId;
	private String compName;
	private String modelName;
	private int speed;
	private String colour;
	@Column(name = "cost")	//rename column
	private int price;

	// no-argument constructor
	public Car() {
			
		}

	// with argument constructor
	public Car(int cId, String compName, String modelName, int speed, String colour, int price) {
			super();
			this.cId = cId;
			this.compName = compName;
			this.modelName = modelName;
			this.speed = speed;
			this.colour = colour;
			this.price = price;
		}

	// Getter and Setter method
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString method
	@Override
	public String toString() {
		return "Cars [cId=" + cId + ", compName=" + compName + ", modelName=" + modelName + ", speed=" + speed
				+ ", colour=" + colour + ", price=" + price + "]";
	}
}
