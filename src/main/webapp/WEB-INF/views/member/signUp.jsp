<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Sign Up</title>
</head>
<body>
	<form action="signup" method="post">
		<input type="text" name="id">
		<input type="password" name="password">
		<input type="text" name="name">
		<input type="number" name="phone">
		<input type="email" name="email">
	
	
		<input type="submit">		
	</form>

</body>
</html>
