<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBlog</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/home.css" />" />
</head>
<body>
	<div id="container">

		<!-- HEADER 영역 -->
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div id="contect">
		
			<!-- Content 영역 -->
				<input type = "text" name = "search">
				<input type = "submit" value = "검색">		
				<br>	
				<br>	
				<input type="radio" name="choice" value="blogtitle" checked="checked">블로그제목 
				<input type="radio" name="choice" value="bloger">블로거

		</div>
		<br>

	</div>
</body>
</html>