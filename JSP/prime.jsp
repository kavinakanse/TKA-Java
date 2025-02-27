<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prime Number Check</title>
</head>
<body>
    <h3>Prime Number Check:</h3>
    <%
    int n = 4; 
    int cnt = 0;

    if (n <= 1) {
        out.print("<p>" + n + " is not a prime number</p>");
    } else {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                break;
            }
        }
        
        if (cnt == 0) {
            out.print("<p>" + n + " is a prime number</p>");
        } else {
            out.print("<p>" + n + " is not a prime number</p>");
        }
    }
    %>
</body>
</html>
