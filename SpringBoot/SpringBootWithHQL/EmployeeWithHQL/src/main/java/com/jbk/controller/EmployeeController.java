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

import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;

@RestController	//used for create Rest APIs
@RequestMapping("/empinfo")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}
	
	@DeleteMapping("/deletedata")
	public String deleteData(@RequestParam int empId) {
		String msg = service.deleteData(empId);
		return msg;
	}
	
	@PutMapping("/updatedata/{empId}")
	public String updateData(@RequestBody Employee e, @PathVariable int empId) {
		String msg = service.updateData(e, empId);
		return msg;
	}
	
	@GetMapping("/getsinglerecord")
	public Employee getSingleRecord(@RequestParam int empId) {
		Employee e1 = service.getSingleRecord(empId);
		return e1;
	}
	
	@GetMapping("/getallrecord")
	public List<Employee> getAllRecord(Employee e){
		List<Employee> list = service.getAllRecord(e);
		return list;
	}
	

}
