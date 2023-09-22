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
	int a=2;
	int cube(int a){
		return a*a*a;
	}
%>
<%=
	"Value of a is "+a+" And cube is "+cube(a)
%>
is 2 less then 3    <%= 2<3 %>
<%= 2*3 %>
</body>
</html>