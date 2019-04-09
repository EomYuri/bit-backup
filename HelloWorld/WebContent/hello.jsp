<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html" charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<!-- 동적으로 값을 할당해 봅시다 -->
	<!-- name 파라미터 -->
	<%
	// JSP는 Request에 관련되 ㄴ객체를
	// request라는 이름으로 미리 만들어 전달
	// Response 객체 -> response
	String name = request.getParameter("name");
	if(name == null) name = "Anomymous";
	%>
	<p>Welcome, <%= name %></p>

</body>
</html>