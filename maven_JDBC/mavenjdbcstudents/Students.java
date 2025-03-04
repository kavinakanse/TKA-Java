package com.mavenjdbcstudents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Students {
	public void insertData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
			PreparedStatement ps = c.prepareStatement("insert into student_info(stud_id, name, city, course, contact, marks) values(?,?,?,?,?,?)");
			ps.setInt(1, 103);
			ps.setString(2, "gauri");
			ps.setString(3, "pune");
			ps.setString(4, "BCA");
			ps.setString(5, "9996663212");
			ps.setInt(6, 65);
			ps.executeUpdate();
			
			System.out.println("Data inserted Successfully....");
			
			c.close();
		}
		catch(Exception e) {
			
		}
	}
	
	public void updateData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
			PreparedStatement ps = c.prepareStatement("update student_info set course=?, marks=? where stud_id=?");
			ps.setInt(3, 102);
			ps.setString(1, "MBA");
			ps.setString(2, "85");
			
			ps.executeUpdate();
			
			System.out.println("Data updated Successfully....");
			
			c.close();
		}
		catch(Exception e) {
			
		}
	}
	
	public void deleteData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
			PreparedStatement ps = c.prepareStatement("delete from student_info where stud_id=?");
			ps.setInt(1, 103);
			ps.executeUpdate();
			
			System.out.println("Data deleted Successfully....");
			
			c.close();
		}
		catch(Exception e) {
			
		}
	}
	
	public void getAllData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
			PreparedStatement ps = c.prepareStatement("select * from student_info");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getInt(6));
			}
			
			c.close();
		}
		catch(Exception e) {
			
		}
	}	
	
	
}
