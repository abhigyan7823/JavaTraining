<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import ="java.util.*" %>

<%
	ArrayList<Integer> al =new ArrayList<>();
	al.add(22);
	out.println(al);
%>

</body>
</html>