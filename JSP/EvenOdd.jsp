<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Even And Odd</title>
</head>
<body>
	<h3>Even Numbers:</h3>
    <ul>
        <%
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                out.print("<li>" + i + "</li>");
            }
        }
        %>
    </ul>
    
    <h3>Odd Numbers:</h3>
    <ul>
        <%
        for(int i = 1; i <= 10; i++) {
            if(i % 2 != 0) {
                out.print("<li>" + i + "</li>");
            }
        }
        %>
    </ul>
</body>
</html>