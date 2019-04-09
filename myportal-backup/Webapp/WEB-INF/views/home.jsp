<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Homepage</title>
<!-- TODO: 현재 페이지에 적절한 CSS를 임포트하십시오. -->
<link type="text/css" 
	rel="stylesheet" 
	href="<%= request.getContextPath() %>/css/home.css"/>
</head>
<body>
  <div id="container">
 
    <!-- HEADER 영역 -->
    <jsp:include page = "/WEB-INF/views/includes/header.jsp"/>

	<!-- NAVIGATION 영역 -->
	<jsp:include page = "/WEB-INF/views/includes/navigation.jsp"/>

	<div id="wrapper">
      <div id="content">
			<!-- Content 영역 -->
			<div id = "site-introduction">
			<p>Java Servlet으로 만든 홈페이지입니다.</p>
			</div>
      </div>
	</div>
	<!-- FOOTER 영역 -->
	<%@ include file = "/WEB-INF/views/includes/footer.jsp" %>
  </div>
</body>
</html>