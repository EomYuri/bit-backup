<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
	prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Homepage</title>
<!-- TODO: 현재 페이지에 적절한 CSS를 임포트하십시오. -->
<link type="text/css" 
	rel="stylesheet" 
	href="<c:url value="/css/home.css" />" />
</head>
<body>
  <div id="container">
    
    <!-- HEADER 영역 -->
    <jsp:include 
    	page="/WEB-INF/views/includes/header.jsp" />
    <!-- Navigation 영역 -->
    <jsp:include
    	page="/WEB-INF/views/includes/navigation.jsp" />
    
	<div id="wrapper">
      <div id="content">
			<!-- Content 영역 -->
		
		<div id="site-introduction">
			<h1>Error</h1>
			<h3>${name }</h3>
			<p>${message }</p>
		
		
		</div>
		
		
		
		
		
      </div>
	</div>
	
	<!-- 푸터 영역 -->
	<%@ include file="/WEB-INF/views/includes/footer.jsp" %>
  </div>
</body>
</html>