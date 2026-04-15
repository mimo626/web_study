<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>표현식 태그 점검</h1>
<hr>
<% int num = 10; %>
<ul>
	<li><%= 100 %></li><!--  100 -->
	<li><%= num %></li> <!-- 10 -->
	<li><%= ++num %></li> <!-- 11 -->
	<li><%= num*2 %></li> <!-- 22 -->
	<li><%= "가나다".length() %></li> <!-- 3 -->
	<li><%= num % 2 == 0 %></li>  <!--  true -->
	<li><%= request.getParameter("stname") %></li> 
	<li><%= new java.util.Date(session.getCreationTime()) %></li> <!-- 세션 만들어진 시간 -->
	<li><%= application.getServerInfo() %></li> 
	<li><%= application.getContextPath() %></li> <!-- edu -->
</ul>
</body>
</html>