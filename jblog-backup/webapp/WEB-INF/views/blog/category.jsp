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
			action="<%= request.getContextPath() %>/blog/{id}/admin/basic">
		</form>
		<!-- Content 영역 -->
		<div>
			<form>
				<li><a href="<%=request.getContextPath()%>/${authUser.id }/admin/basic">
						기본설정 </a></li>
				<li><a href="<%=request.getContextPath()%>/${authUser.id }/admin/category">
						카테고리 </a></li>
				<li><a
					href="<%= request.getContextPath() %>/${authUser.id }/admin/write">
						글 작성 </a></li>
			</form>
		</div>
		<div>
		<form method=" action"
			action="${pageContext.servletContext.contextPath}/category/delete">
			<table border="1">
				<tr>
				<th>번호</th>
				<th>카테고리명</th>
				<th>포스트 수</th>
				<th>설명</th>
				<th>삭제</th>
				<tr>
				<td>cateNo</td>
				<td>cateName</td>
				<td>description</td>
				<td><a href="<%= request.getContextPath() %>/guestbook/delete/cateNo">
									X</a></td>
			
			</table>
		</form>
		<form method="POST"
				action="${pageContext.servletContext.contextPath}/categoty/add"
				enctype="multipart/form-data">
		<p>새로운 카테고리 추가</p>
		<br/>
		<label>카테고리명</label>
		<input type="text" name="catename">
		<label>설명</label>
		<input type="text" name="description">
		<br/>
		<input type="submit" value="카테고리 추가" style="width: 200px">
		</form>
		</div>
		
	</div>
	<jsp:include page="../includes/footer.jsp" />
	<br>

</body>
</html>