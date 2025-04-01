package com.tka.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Employee.dao.EmployeeDao;
import com.tka.Employee.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao sd;
	
	public String insertData(Employee e) {
		String msg = sd.insertData(e);
		return msg;
	}
	
	public String deleteData(int empId) {
		String msg = sd.deleteData(empId);
		return msg;
	}

	public String updateData(Employee e , int empId) {
		String msg = sd.updateData(e, empId);
		return msg;
	}
	
	public Employee getSingleRecord(int empId) {
		Employee e = sd.getSingleRecord(empId);
		return e;
	}
	
	public List<Object> getAllRecord(Employee e) {
		List<Object> list = sd.getAllRecord(e);
		return list;
	}
}
