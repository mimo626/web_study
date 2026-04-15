<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Insert title here</title>
</head>
<body>
<h1>서블릿과 JSP 의 객체 공유</h1>
<hr>
<h2>서블릿이 전달한 데이터 추출-표현식 태그</h2>
<ul>
<li>요청 스코프 : <%= request.getAttribute("myRequest") %></li>
<li>세션 스코프 : <%= session.getAttribute("mySession") %></li>
<li> 어플리케이션 스코프 : <%= application.getAttribute("myApp") %></li>
</ul>
<hr>
<h2>서블릿이 전달한 데이터 추출-EL<//h2> 
<ul>

</ul>		
</body>
</html>



