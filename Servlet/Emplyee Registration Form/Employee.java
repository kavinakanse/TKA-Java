package com.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmpInfo")
public class Employee extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String date = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String status = req.getParameter("status");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String contact = req.getParameter("contact");
//		long contact1 = Long.parseLong(contact);
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String role = req.getParameter("role");
		String joining_date = req.getParameter("joining_date");
		String salary = req.getParameter("salary");
//		long salary1 = Long.parseLong(salary);
		String experience = req.getParameter("experience");
//		int experience1 = Integer.parseInt(experience);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "root");
			PreparedStatement ps = c.prepareStatement("insert into emp_info(fname, lname, dob, gender, marital_status, email, password, contact, city, country, role, joining_date, salary, experience) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,fname);
			ps.setString(2, lname);
			ps.setString(3, date);
			ps.setString(4, gender);
			ps.setString(5, status);
			ps.setString(6, email);
			ps.setString(7, password);
			ps.setString(8, contact);
			ps.setString(9, city);
			ps.setString(10, country);
			ps.setString(11, role);
			ps.setString(12, joining_date);
			ps.setString(13, salary);
			ps.setString(14, experience);
			ps.executeUpdate();
			
			PrintWriter out = resp.getWriter();
			System.out.println("Data is insered....");
			out.print("<h1>"+"Data is inserted Successfully....."+"</h1>");
			c.close();
			
		} catch (Exception e) {

		}

	}
}
