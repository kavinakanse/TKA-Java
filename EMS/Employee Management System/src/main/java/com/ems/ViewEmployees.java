package com.ems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewEmployees extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect to Database
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "root");

			// SQL Query to Fetch Employees
			String sql = "SELECT fname, lname, dob, gender, marital_status, email, contact, city, country, role, joining_date, salary, experience FROM emp_info";
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			// Store Data in List
			List<Employees> e = new ArrayList<>();
			while (rs.next()) {
				Employees emp = new Employees();
				emp.setFname(rs.getString("fname"));
				emp.setLname(rs.getString("lname"));
				emp.setDob(rs.getString("dob"));
				emp.setGender(rs.getString("gender"));
				emp.setMaritalStatus(rs.getString("marital_status"));
				emp.setEmail(rs.getString("email"));
				emp.setContact(rs.getString("contact"));
				emp.setCity(rs.getString("city"));
				emp.setCountry(rs.getString("country"));
				emp.setRole(rs.getString("role"));
				emp.setJoiningDate(rs.getString("joining_date"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setExperience(rs.getInt("experience"));
				e.add(emp);
			}
			System.out.println("Query executed: " + sql);
			System.out.println("Employee list size: " + e.size());

			req.setAttribute("employees", e);

			// Forward to JSP Page
			req.getRequestDispatcher("view.jsp").forward(req, resp);

			// Close all Connection
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
			resp.getWriter().write("Error: " + e.getMessage());
		}
	}
}
