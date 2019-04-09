<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!-- 내부에서 exception이라는 객체를 사용할 수 있게 됨 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/hml; charset=UTF-8">
<title>Error Page</title>
</head>
<body>
	<h1>오류 발생</h1>
	<p>Error Code: <%= response.getStatus() %> </p>
	<p>CAUSE: <%= exception.getCause() %></p>
	<p>Error Message: <%= exception.getMessage() %></p>
</body>
</html>