<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Member Update</title>
</head>
<body>
	<form action="mupdate" method="post">
		<input type="text" name="id" readonly>
		<input type="password" name="password">
		<input type="text" name="name">
		<input type="number" name="phone">
		<input type="email" name="email">
	
		<input type="submit">
	</form>

	<a href="home">메인 페이지</a>
</body>
</html>
