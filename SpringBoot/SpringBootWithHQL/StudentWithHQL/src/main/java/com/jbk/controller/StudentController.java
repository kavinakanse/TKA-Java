package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.service.StudentService;

@RestController
@RequestMapping("/studinfo")
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}
	
	@DeleteMapping("/deletedata")
	public String deleteData(@RequestParam int studId) {
		String msg = service.deleteData(studId);
		return msg;
	}
	
	@PutMapping("/updatedata/{studId}")
	public String updateData(@RequestBody Student s, @PathVariable int studId) {
		String msg = service.updateData(s, studId);
		return msg;
	}
	
	@GetMapping("/getsinglerecord")
	public Student getSingleRecord(@RequestParam int studId) {
		Student s = service.getSingleRecord(studId);
		return s;
	}
	
	@GetMapping("/getallrecord")
	public List<Student> getAllRecord(Student s) {
		List<Student> list = service.getAllRecord(s);
		return list;
	}
}
