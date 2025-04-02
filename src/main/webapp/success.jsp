<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">

<tr>
<th>Name</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>ACTION</th>
</tr>

<c:forEach items="${data }" var="s">

<tr>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password}</td>
<td><a href="edit?rollno=${s.rollno}">EDIT</a>|| <a href="delete?rollno=${s.rollno}">DELETE</a>
</tr>
</c:forEach>


</table>
</body>
</html>
