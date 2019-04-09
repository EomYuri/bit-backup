<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 성공</title>
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


					<p>"감사합니다. 회원 가입 및 블로그가 성공적으로 만들어 졌습니다."</p>


				</div>
				<li><a href="<%= request.getContextPath() %>/users/login">
						로그인하기 </a>
			</div>
		</div>

	</div>


</body>
</html>