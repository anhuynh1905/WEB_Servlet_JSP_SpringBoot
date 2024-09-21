<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
</head>
<body>
	<h1>Hi admin</h1>
	<form action="logout" method="post">

		<h2>
			Hello
			<%=request.getParameter("name")%>! <br> <input type="submit"
				value="Logout" />
	</form>
	</form>
</body>
</html>