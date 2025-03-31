package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDao;
import com.jbk.entity.Employee;

@Service	//marks class as a service which contains business logic 
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public String insertData(Employee e) {
		String msg = dao.insertData(e);
		return msg;
	}
	
	public String deleteData(int empId) {
		String msg = dao.deleteData(empId);
		return msg;
	}
	
	public String updateData(Employee e, int empId) {
		String msg = dao.updateData(e, empId);
		return msg;
	}
	
	public Employee getSingleRecord(int empId) {
		Employee e1 = dao.getSingleRecord(empId);
		return e1;
	}
	
	public List<Employee> getAllRecord(Employee e){
		List<Employee> list = dao.getAllRecord(e);
		return list;
	}
}
