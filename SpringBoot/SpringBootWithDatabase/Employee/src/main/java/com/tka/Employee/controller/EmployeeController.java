package com.tka.Employee.controller;

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

import com.tka.Employee.entity.Employee;
import com.tka.Employee.service.EmployeeService;


@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody Employee e) {
		String msg = es.insertData(e);
		return msg;
	}
	
	@DeleteMapping("/deletedata")
	public String deleteData(@RequestParam int empId) {
		String msg = es.deleteData(empId);
		return msg;
		
	}
	
	@PutMapping("/updatedata")
	public String updateData(@RequestBody Employee e, @RequestParam int empId) {
		String msg = es.updateData(e, empId);
		return msg;
	}
	
	@GetMapping("/getsingledata")
	public Employee getSingleRecord(@RequestParam int empId) {
		Employee e = es.getSingleRecord(empId);
		return e;
	}
	
	@GetMapping("/getallrecord")
	public List<Object> getAllRecord(Employee e) {
		List<Object> list = es.getAllRecord(e);
		return list;
	}
	
}
