<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*,com.demo.jsp.Student" %>
<%
	List<Student> StudentData=new ArrayList<>();
	StudentData.add(new Student("Harry","Potter",true));
	StudentData.add(new Student("Ron","Weasly",false));
	StudentData.add(new Student("Hermonie","Ranger",true));
	
	pageContext.setAttribute("Student1",StudentData);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="tamp" items="${Student1}">
		<c:if test="${tamp.goldCustomer}">
			${tamp.firstName} ${tamp.lastName}
			<br/>
		</c:if>
	</c:forEach>

</body>
</html>