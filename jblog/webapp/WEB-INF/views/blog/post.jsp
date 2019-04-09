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
		<div style="width:580px; background-color:#fff; margin :0 400px">
			<form>
			<ul>
				<li><a
					href="<%=request.getContextPath()%>/${authUser.id }/admin/basic">
						기본설정 </a></li>
				<li><a
					href="<%=request.getContextPath()%>/${authUser.id }/admin/category">
						카테고리 </a></li>
				<li><a
					href="<%= request.getContextPath() %>/${authUser.id }/admin/write">
						글 작성 </a></li>
			</ul>
			</form>
		</div>
		<div style="width:580px; background-color:#fff; margin :0 400px">
			<form method="POST"
				action="<%= request.getContextPath() %>/${authUser.id }/admin/write">
				<label>제목</label> 
				<input type="text" name="postTitle"> 
				<br/>
				<select	name="cateNo">
					<c:forEach items="${cateList}" var="cateVo">
						<option value="${cateVo.cateNo }">${cateVo.cateName }</option>
					</c:forEach>
				</select> 
				<br/>
				<label>내용</label>
					<textarea name="postContent"></textarea>
					<br /> 
					<input type="submit" value="포스트 하기" style="width: 200px">

			</form>



		</div>
	</div>
	<jsp:include page="../includes/footer.jsp" />
	<br>

</body>
</html>