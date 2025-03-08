package com.service;

import com.dao.StudentDAO;

public class StudentService {
	
	
	public void insertData() {
		StudentDAO sd = new StudentDAO();
		sd.insertData();
		
		
	}

	public void updateData() {
		StudentDAO sd = new StudentDAO();
		sd.updateData();
	}

	public void deleteData() {
		StudentDAO sd = new StudentDAO();
		sd.deleteData();
		
	}

	public void getSingleRecord() {
		StudentDAO sd = new StudentDAO();
		sd.getSingleRecord();

		
	}

	public void getAllRecord() {
		StudentDAO sd = new StudentDAO();
		sd.getAllRecord();
		
	}

}
