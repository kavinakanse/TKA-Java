package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student;
import com.tka.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}
	
	@DeleteMapping("/deletedata/{studId}")
	public String deleteData(@PathVariable int studId) {	//here we can use @RequestParam also
		String msg = service.deleteData(studId);
		return msg;
	}
	
	@PutMapping("/updatedata/{studId}")
	public String updateData(@RequestBody Student s, @PathVariable  int studId) {
		String msg = service.updateData(s, studId);
		return msg;
	}

}
