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
			<form>
				<label>제목</label>
				<input type = "text" name = "posttitle" >
				<select name = "category">
					<option value = "1">스프링MVC</option>
					<option value = "2">서블릿_JSP</option>
					<option value = "3">오라클</option>
					<option value = "4">자바프로그래밍</option>
				</select>
				<label>내용</label>
				<textarea name="content"></textarea>
				</form>
				<br/>
				<form method="POST"
					action="<%= request.getContextPath() %>/${authUser.id }/admin/write"
					enctype="multipart/form-data">
					<input type="submit" value="포스트 하기" style="width:200px">
				
				</form>
		
		
		
		</div>
	</div>
	<jsp:include page="../includes/footer.jsp" />
	<br>

</body>
</html>