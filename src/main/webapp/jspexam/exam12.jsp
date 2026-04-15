<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<h2>include 지시자와 액션태그 비교</h2>
<hr>
<%--
<%@ include file="exam9.jsp" 
<hr>
<%@ include file="exam9.jsp" %> --%>  
<hr>
<jsp:include page="exam9.jsp" />
<hr>
<jsp:include page="exam9.jsp" />  
</body>
</html>






