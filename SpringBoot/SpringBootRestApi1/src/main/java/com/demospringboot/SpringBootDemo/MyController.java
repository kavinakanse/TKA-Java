package com.demospringboot.SpringBootDemo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/myntra")
public class MyController {

	@RequestMapping(value = "/men", method = RequestMethod.GET)
	public String firstApi() {
		return "Shopping for Mens....";
	}
	
	@RequestMapping(value="/women", method = RequestMethod.POST)
	public String secondApi() {
		return "Shopping for Women...";
	}
	
	@RequestMapping(value = "/kids", method = RequestMethod.PUT)
	public String thirdApi() {
		return "Shopping for Kids...";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.DELETE)
	public String fourthApi() {
		return "Shopping for Home....";
	}
	
	@GetMapping(value="/beauty")
	public String fifthApi() {
		return "shopping for Beauty....";
	}
	
	@PostMapping
	public String sixthApi() {
		return "Shopping for Mobile....";
	}
	
	@PutMapping
	public String seventhApi() {
		return "Shopping for Laptop...";
	}
	
	@DeleteMapping
	public String eighthApi() {
		return "Shopping for Headphones...";
	}
}
