<%@page import="com.entity.UserEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<UserEntity> users = (List<UserEntity>) request.getAttribute("users");
	%>

	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FristName</th>
			<th>Email</th>
			<th>Action</th>
		</tr>

		<%
		for (UserEntity user : users) {
		%>

		<tr>
			<Td><%=user.getUserId()%></Td>
			<td><%=user.getFirstName()%></td>
			<td><%=user.getEmail()%></td>
			<td><a href="deleteuser?userId=<%=user.getUserId() %>">Delete</a>
		</tr>
		<%
		}
		%>

	</table>




</body>
</html>