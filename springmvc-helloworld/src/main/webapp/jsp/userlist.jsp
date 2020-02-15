
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<table border="2">
<tr>
<td>password</td>
<td>username</td>
<td>firstname</td>
<td>lastname</td>
<td>email</td>
<td>phone</td>
<td>address</td>
<td>age</td>
</tr>
<c:forEach items="${userlist}" var="user">
<tr>
<td>${user.password}</td>
<td>${user.username}</td>
<td>${user.firstname}</td>
<td>${user.lastname}</td>
<td>${user.email}</td>
<td>${user.phone}</td>
<td>${user.address}</td>
<c:choose>
<c:when test="${user.age<20 }">
<td style="background-color: lightblue">${user.age }</td>
</c:when>
<c:otherwise>
<td style="background-color: red">${user.age }</td>
</c:otherwise>
</c:choose>
</c:forEach>
</body>
</html>