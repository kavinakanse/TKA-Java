package com.jbk.SpringBootRestApi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/bookmyshow")
public class MyController {

	@RequestMapping(value="/movie", method=RequestMethod.GET)
	public String firstApi() {
		return "Movies....";
	}
	
	@RequestMapping(value="/stream", method=RequestMethod.POST)
	public String secondApi() {
		return "Stream";
	}
	
	@RequestMapping(value="/events", method=RequestMethod.PUT)
	public String thirdApi() {
		return "Events";
	}
	
	@RequestMapping(value="/plays", method = RequestMethod.DELETE)
	public String fourthApi() {
		return "Plays";
	}
	
	@GetMapping(value="/sports")
	public String fifthApi() {
		return "Sports";
	}
	
	@PostMapping(value="/activities")
	public String sixthApi() {
		return "Activites..";
	}
	
	@PutMapping(value="/listyourshow")
	public String seventhApi() {
		return "ListYourShow...";
	}
	
	@DeleteMapping(value="/corporates")
	public String eighthApi() {
		return "Corporates";
	}
	
}
