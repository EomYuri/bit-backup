<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<!-- TODO: 현재 페이지에 적절한 CSS를 임포트하십시오. -->
<link type="text/css" rel="stylesheet"
	href="<%= request.getContextPath() %>/css/home.css" />
</head>
<body>
	<div id="container">
	<%--HEADER영역--%>
		<jsp:include page="../includes/header.jsp" />
		<div id="wrapper">
			<div id="content">
				<!-- Content 영역 -->
				<div id="user">
					<!-- Login form -->
					<form id="login-form" name="loginForm" method="POST"
						action="<%= request.getContextPath() %>/users/login">

						<label class="block-label" for="id">아이디</label> 
						<input type="text" name="id"> 
						<br>
						<label class="block-label" for="password">패스워드</label> 
						<input type="password" name="password"> 
						<br>
						<br>
						<input type="submit" value="로그인" style="width:200px">
						<br>
					</form>


				</div>
			</div>
		</div>

	</div>

</body>
</html>