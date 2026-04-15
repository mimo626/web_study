<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	@font-face {
    font-family: 'OmuDaye';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2304-01@1.0/omyu_pretty.woff2') format('woff2');
    font-weight: normal;
    font-display: swap;
}
	body{
		text-align: center;
		font-family: 'OmuDaye';
	}
	h1 {
		text-align: center;
	}
	img {
		display: block;
		margin: 20px auto;
		width: 400px;
	}
</style>
</head>
<body>
	<h1><%= request.getAttribute("msg") %></h1>
	<hr>
	<%
	    String imgInfo = (String) request.getAttribute("imginfo");
	    if(imgInfo != null) {
	%>
	    <img alt="이미지" src="<%= imgInfo %>">
	<%
	    }
	%>

	<output></output>
	<script>
	const isSuccess = <%= request.getAttribute("isSuccess") %>;
	const isTry =  <%= request.getAttribute("isTry") %>;
	document.querySelector('h1').style.color = isSuccess ? "blue" : "red";
	if(!isSuccess && isTry) {
        document.querySelector('output').innerHTML = "<a href='/edu/clientexam/lottoForm3.html'>재시도</a>";
    }
	</script>
</body>
</html>