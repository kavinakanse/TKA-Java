package com.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/updateProfile")
public class Update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Retrieving form data from the request
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String date = req.getParameter("date");
		String gender = req.getParameter("gender");
		String status = req.getParameter("status");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String contact = req.getParameter("contact");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String role = req.getParameter("role");
		String joining_date = req.getParameter("joining_date");
		String salary = req.getParameter("salary");
		String experience = req.getParameter("experience");

		// creating printWriter object to write response object
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		try {
			// registering and loading the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting connection
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");

			// sql query which will pass as parameter in preparedStatement
			String sql = "UPDATE emp_info SET fname=?, lname=?, DOB=?, gender=?, marital_status=?, password=?, contact=?, city=?, country=?, role=?, joining_date=?, salary=?, experience=? WHERE email=?";
			PreparedStatement ps = c.prepareStatement(sql);

			// setting parameter
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, date);
			ps.setString(4, gender);
			ps.setString(5, status);
			ps.setString(6, password);
			ps.setString(7, contact);
			ps.setString(8, city);
			ps.setString(9, country);
			ps.setString(10, role);
			ps.setString(11, joining_date);
			ps.setString(12, salary);
			ps.setString(13, experience);
			ps.setString(14, email);// where clause condition

			int update = ps.executeUpdate();

			if (update > 0) {
				// if update is successful it will redirect to login page
				System.out.println("data is updated....");
				out.println(
						"<script>alert('Profile Updated successfully!!');window.location.href='login.html';</script>");
//            	RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
//				rd.forward(req, resp);

			} else {
				System.out.println("data is not updated.....");
				out.println(
						"<script>alert('Failed to update data. User not found.');window.location.href='profile.jsp';</script>");
//            	resp.sendRedirect("update.html");
			}

			c.close();

		} catch (Exception e) {
			e.printStackTrace(); // This prints errors in the server logs
			resp.getWriter().println("Error: " + e.getMessage());
		}

	}
}
