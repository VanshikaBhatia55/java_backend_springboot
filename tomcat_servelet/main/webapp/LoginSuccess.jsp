<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success Page</title>
</head>
<body>
    <H3><%= request.getAttribute("user") %>, Login Successful</H3>
    <a href="login.html">Login Page</a>
</body>
</html>
