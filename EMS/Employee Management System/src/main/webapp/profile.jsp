<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <link rel="stylesheet" href="profileStyle.css">
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

        .logout-btn {
           /*background-color: #d9534f;*/
            border-radius: 5px;
            padding: 10px 20px;
            color: white;
            text-decoration: none;
        }

        .logout-btn:hover {
            background-color: #c9302c;
        }
    </style>
</head>
<body>

	 <!-- NavBar -->
    <div class="navbar">
        <a href="home.html">Home</a>
        <a href="register.html">Add New Employee</a>
        <a href="login.html">Login</a>
        <a href="update.html">update</a>
        <a href="${pageContext.request.contextPath}/view">View All Employees</a>

        <a href="login.html">Logout</a>
    </div>

    <div class="container" style=''>
        <div class="profile-card">
        
            <div class="profile-info">
             <h1 class="profile-heading">Welcome, ${fname}!</h1>
                <img src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png" alt="Profile Picture" class="profile-pic">
                <h2>${fname} ${lname}</h2>
                <p class="profile-role">${role}</p>
            </div>
            
            <div class="profile-details">
                <p><strong>Date of Birth:</strong> ${date}</p>
                <p><strong>Gender:</strong> ${gender}</p>
                <p><strong>Marital Status:</strong> ${status}</p>
                <p><strong>Email:</strong> ${email}</p>
                <p><strong>Contact No:</strong> ${contact}</p>
                <p><strong>City:</strong> ${city}</p>
                <p><strong>Country:</strong> ${country}</p>
                <p><strong>Joining Date:</strong> ${joining_date}</p>
                <p><strong>Salary:</strong> ${salary}</p>
                <p><strong>Experience:</strong> ${exeprience} years</p>
            </div>      
        </div>
    </div>
</body>
</html>
