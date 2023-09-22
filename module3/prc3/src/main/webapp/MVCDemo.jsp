<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th> First Name</th>
		<th> Email</th>
	</tr>
	<c:forEach var="tamp" items="${student_list }">
		<tr>
		  <td> ${tamp.fname } </td>
		  <td> ${tamp.email } </td>
		</tr>
	</c:forEach>
</table>
</body>
</html>