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
		<jsp:include page="../includes/blogheader.jsp" />
		<!-- Navigation 영역 -->
		<jsp:include page="../includes/navigation.jsp" />
		</div>
		<div id="content">
		
			<!-- Content 영역 -->
			<div id ="latestPost" style="width : 500px; border: 1px solid #000; text-align: center">
			<p>${PostVo.postTitle }</p>
			<p>${PostVo.postContent }</p>
			</div>

			<div style="border:1px solid #000; width: 500px; margin: 10px 0px">
				<c:choose>
					<c:when test="${not empty authUser}">
						<form method="post" action="<%=request.getContextPath() %>/${blogUser.id}/comments/${PostVo.postNo}/${authUser.userNo}"> 
							<table>
								<tr>
									<td>${authUser.userName }</td>
									<td><input type="text" name="cmtContent" placeholder="댓글을 남겨주세요."></td>
									<td><input type="submit" value="저장"></td>
								</tr>
							</table>
						</form>
					</c:when>
				</c:choose>
				
				<c:choose>
					<c:when test="${not empty CommentsList}">
						<table>
							<c:forEach items="${CommentsList}" var="commVo">
								<tr>
									<td>${commVo.userName }</td>
									<td>${commVo.cmtContent }</td>
									<td>${commVo.regDate }</td>
								
								</tr>	
							</c:forEach>
						</table>
					</c:when>
				</c:choose>
			</div>
			
			
		
			<div id="PostList" style="border:1px solid #000; width: 500px">
				<table>
					<c:forEach items="${PostList }" var="postVo">
						<tr>
						<td><a href="<%=request.getContextPath() %>/${blogUser.id}/post/${postVo.postNo}" style="text-decoration: none; color: #000000; font-weight: bold;">${postVo.postTitle }</a></td>
						<td>${postVo.regDate }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
			<jsp:include page="../includes/footer.jsp" />
		<br>

</body>
</html>