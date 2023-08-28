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
	
	out.println("Hello");
	for(int i=2;i<12;i++){
		out.println(i);
	}
%>
<%
	int a=10;
	out.println(a);
%>
</body>
</html>