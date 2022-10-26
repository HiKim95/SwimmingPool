<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Sign In</title>
</head>
<body>
	<form action="signin" method="post">
		<input type="text" name="id">
		<input type="password" name="password">
	
		<input type="submit">		
	</form>

	<a href="signupf">회원가입</a>

</body>
</html>
