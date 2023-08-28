<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	int a=10;
	int cube(int n){
		return n*n*n;
	}
	
%>
<%
	out.println(a);
	out.println(cube(3));
%>

</body>
</html>