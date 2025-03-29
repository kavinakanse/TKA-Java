package com.tka.Employee.service;

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
}
