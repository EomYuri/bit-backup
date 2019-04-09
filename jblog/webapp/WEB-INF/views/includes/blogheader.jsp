<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="blogVo" scope="session" value="${sessionScope.blogVo}" />
<c:set var="authUser" scope="session" value="${sessionScope.authUser}" />

<div id="header">
	<h1><a style="text-decoration:none; color:#fff" href="<%= request.getContextPath() %>/${authUser.id }">${blogVo.blogTitle}</a></h1>
	<ul>
		<c:choose>

			<c:when test="${empty authUser }">
				<!-- 로그인 안된 경우의 메뉴 -->
				<li><a href="<%=request.getContextPath()%>/users/login">
						로그인 </a></li>
			</c:when>
			<c:when test="${authUser.userNo eq blogVo.userNo }">
				<!-- 본인의 블로그일때 -->
				<li><a href="<%=request.getContextPath()%>/users/logout">
						로그아웃 </a></li>
				<li><a
					href="<%= request.getContextPath() %>/${authUser.id }/admin/basic">
						내 블로그 관리 </a></li>
				
			</c:when>
			<c:otherwise>
				<!-- 로그인은 됐는데, 본인 블로그가 아닐 때 -->
				<li><a href="<%=request.getContextPath()%>/users/logout">
						로그아웃 </a></li>
			</c:otherwise>
		</c:choose>
	</ul>
</div>
<!-- /header -->




