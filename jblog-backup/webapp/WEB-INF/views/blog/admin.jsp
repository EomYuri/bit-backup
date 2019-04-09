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
			<form method="POST"
				action="${pageContext.servletContext.contextPath}/${authUser.id }/admin/upload"
				enctype="multipart/form-data">
				<label>블로그 제목</label> 
				<input type="text" name="blogtitle">
				<br /> 
				<label>로고이미지</label> 
				<img src="${pageContext.servletContext.contextPath }/${blogVo.logoFile}" style="width:150px">
				<input type="file" name="user_file">
				<input type="submit" value="기본 설정 변경" style="width: 200px">
			</form>


		</div>
	</div>
	<jsp:include page="../includes/footer.jsp" />
	<br>

</body>
</html>