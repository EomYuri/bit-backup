<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBlog</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/mysite.css" />" />
</head>
<body>
	<div id="container">

		<!-- HEADER 영역 -->
		<jsp:include page="/WEB-INF/views/includes/blogheader.jsp" />
		</div>
		<div id="content">
		<form id="blog-home" name="blogHome" method="POST"
						action="<%= request.getContextPath() %>/blog/{id}">
						</form>
			<!-- Content 영역 -->
				<p>블로그 홈</p>

		</div>
			<jsp:include page="../includes/footer.jsp" />
		<br>

</body>
</html>