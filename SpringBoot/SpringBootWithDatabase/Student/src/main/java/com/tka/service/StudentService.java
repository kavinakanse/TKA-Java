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

	public String deleteData(int studId) {
		String msg = sd.deleteData(studId);
		return msg;
		
	}
	
	public String updateData(Student s, int studId) {
		String msg = sd.updateData(s, studId);
		return msg;
	}
}
