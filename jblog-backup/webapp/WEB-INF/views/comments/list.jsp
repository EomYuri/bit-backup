<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/users.css" />
<title>방명록</title>
</head>
<body>
	<div id="container">
		<!-- HEADER 영역 -->
		<jsp:include page="/WEB-INF/views/includes/blogheader.jsp" />
		<div id="wrapper">
			<div id="content">
				<c:choose>

					<c:when test="${empty authUser }">
						<!-- 로그인 안된 경우 -->
				<c:forEach items="${list }" var="vo">

					<table width=510px border=0px>
						<tr>
							<td>이름</td>
							<td>cmtContent</td>
							<td>regDate</td>
						</tr>
					</table>
					<br />
				</c:forEach>

					</c:when>
					
					
					<c:when test="${authUser.userNo eq blogVo.userNo }">
						<!-- 로그인후, 본인이 쓴 댓글일때 -->
						<form action="<%=request.getContextPath()%>/comments/write"
					method="POST">
					<table border=1 width=500>
						<tr>
							<td></td>
							<td><input type="text" name="name"></td>
							<td>비밀번호</td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>
							<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
						</tr>
						<tr>
							<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
						</tr>
					</table>
				</form>
				<br />
				<c:forEach items="${list }" var="vo">


					<table width=510px border=0px>
						<tr>
							<td>이름</td>
							<td>cmtContent</td>
							<td>regDate</td>
							<td><a
								href="<%= request.getContextPath() %>/comments/delete/${vo.no}">
									X </a></td>
						</tr>
					</table>
					<br />
				</c:forEach>

					</c:when>
					<c:otherwise>
						<!-- 로그인은 됐는데, 본인 쓴 댓글 아닐 때 -->


					</c:otherwise>

				</c:choose>





				<form action="<%=request.getContextPath()%>/guestbook/write"
					method="POST">
					<table border=1 width=500>
						<tr>
							<td></td>
							<td><input type="text" name="name"></td>
							<td>비밀번호</td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>
							<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
						</tr>
						<tr>
							<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
						</tr>
					</table>
				</form>
				<br />
				<!-- JSTL LOOP -->
				<c:forEach items="${list }" var="vo">


					<table width=510 border=1>
						<tr>
							<td>[${vo.no }]</td>
							<td>${vo.name }</td>
							<td>${vo.regDate }</td>
							<td><a
								href="<%= request.getContextPath() %>/guestbook/delete/${vo.no}">
									삭제 </a></td>
						</tr>
						<tr>
							<td colspan=4>${vo.content }</td>
						</tr>
					</table>
					<br />
				</c:forEach>
			</div>

		</div>
		<jsp:include page="../includes/footer.jsp" />
	</div>
</body>
</html>