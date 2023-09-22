<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
   Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));
   
   firstName.setMaxAge(60*60*24); 
   lastName.setMaxAge(60*60*24); 
   
   response.addCookie( firstName );
   response.addCookie( lastName );
%>
</body>
</html>