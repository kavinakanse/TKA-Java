<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.ems.Employees" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Employees</title>
    <style>
        /* Navbar Styles */
        .navbar {
            background-color: #1a79b7;
            overflow: hidden;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            font-size: 1rem;
        }

        .navbar a:hover {
            background-color: #155a8a;
            border-radius: 5px;
        }

        .container {
            width: 90%;
            margin: auto;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
        }

        th {
            background-color: #1a79b7;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

    <!-- Navigation Bar -->
    <div class="navbar">
        <a href="home.html">Home</a>
        <a href="profile.jsp">Profile</a>
        <a href="update.html">Update Profile</a>
        <a href="view.jsp">View Employees</a>
        <a href="login.html" style="background-color: #d9534f; border-radius: 5px;">Logout</a>
    </div>
<form action="view" method="get">
    <div class="container">
        <h2>All Employees</h2>
        <table>
            <tr>
                
                <th>First Name</th>
                <th>Last Name</th>
                <th>Date of Birth</th>
                <th>Gender</th>
                <th>Marital Status</th>
                <th>Email Id</th>
                <th>Contact</th>
                <th>City</th>
                <th>Country</th>
                <th>Role</th>
                <th>Joining date</th>
                <th>Salary</th>
                <th>Experience</th>
            </tr>
            <%
                List<Employees> e = (List<Employees>) request.getAttribute("employees");
                if (e != null) {
                    for (Employees emp : e) {
            %>
            <tr>
                <td><%= emp.getFname() %></td>
                <td><%= emp.getLname() %></td>
                <td><%= emp.getDob() %></td>
                <td><%= emp.getGender() %></td>
                <td><%= emp.getMaritalStatus() %></td>
                <td><%= emp.getEmail() %></td>
                <td><%= emp.getContact() %></td>
                <td><%= emp.getCity() %></td>
                <td><%= emp.getCountry() %></td>
                <td><%= emp.getRole() %></td>
                <td><%= emp.getJoiningDate() %></td>
                <td><%= emp.getSalary() %></td>
                <td><%= emp.getExperience() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="8">No employees found.</td>
            </tr>
            <%
                }
            %>
        </table>
    </div>
</form>
</body>
</html>
