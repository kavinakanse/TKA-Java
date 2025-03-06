package com.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		// Retrieve email and password from the request
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		try {
			// Load the MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish a connection to the db
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","root");
			
			 // Prepare an SQL statement to check if the email and password exist in the database
			PreparedStatement ps = c.prepareStatement("select * from emp_info where email=? and password=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			 // Execute the query and store the result in ResultSet
			ResultSet rs = ps.executeQuery();
			
			// Get the PrintWriter object to write response output
			PrintWriter out = resp.getWriter();
			
			 // If a matching record is found, retrieve employee details and forward to profile.jsp
			if(rs.next()) {
//				out.print("<h1>"+"Login Successfully..!!");
				req.setAttribute("fname", rs.getString(1));
				req.setAttribute("lname", rs.getString(2));
				req.setAttribute("date", rs.getString(3));
				req.setAttribute("gender", rs.getString(4));
				req.setAttribute("status", rs.getString(5));
				req.setAttribute("email", rs.getString(6));
				req.setAttribute("contact", rs.getString(8));
				req.setAttribute("city", rs.getString(9));
				req.setAttribute("country", rs.getString(10));
				req.setAttribute("role", rs.getString(11));
				req.setAttribute("joining_date", rs.getString(12));
				req.setAttribute("salary", rs.getString(13));
				req.setAttribute("experience", rs.getString(14));
				
				// Forward the request to profile.jsp to display user details
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);
			}
			else {
				// If login fails, print an error message
				out.print("<h1>"+"Invalid email or password..!!");
			}
			
			//close all connection 
			c.close();
		}
		catch(Exception e) {
			
		}
	}
}
