package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.StudentDao;
import com.jbk.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}
	
	public String deleteData(int studId) {
		String msg = dao.deleteData(studId);
		return msg;
	}
	
	public String updateData(Student s, int studId) {
		String msg = dao.updateData(s, studId);
		return msg;
	}
	
	public Student getSingleRecord(int studId) {
		Student s = dao.getSingleRecord(studId);
		return s;
	}
	
	public List<Student> getAllRecord(Student s) {
		List<Student> list = dao.getAllRecord(s);
		return list;
	}
}
