<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="header">
<a href="${pageContext.servletContext.contextPath }/home"> <img
				src="${pageContext.servletContext.contextPath }/upload-images/jblog.jpg"
				height=200 alt="jblog"></a> 
	<ul>
	
		<c:choose>
			
			<c:when test="${empty authUser }">
				<!-- 로그인 안된 경우의 메뉴 -->
				<li><a href="<%= request.getContextPath() %>/users/login">
						로그인 </a></li>
				<li><a href="<%= request.getContextPath() %>/users/join">
						회원가입 </a></li>
			</c:when>
			<c:otherwise>

				<li><a href="<%= request.getContextPath() %>/users/logout">
						로그아웃 </a></li>
				<li><a href="<%= request.getContextPath() %>/${authUser.id}">
						내 블로그 </a></li>
			</c:otherwise>
		</c:choose>

	</ul>
</div>
<!-- /header -->




