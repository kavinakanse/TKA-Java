package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao sd;
	
	public String insertData(Student s) {
		String msg = sd.insertData(s);
		return msg;
		
	}
}
