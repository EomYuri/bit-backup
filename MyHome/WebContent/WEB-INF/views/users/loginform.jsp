<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Homepage</title>
<!-- TODO: 현재 페이지에 적절한 CSS를 임포트하십시오. -->
<link type="text/css" rel="stylesheet"
	href="<%= request.getContextPath() %>/css/users.css" />
</head>
<body>
	<div id="container">

		<!-- HEADER 영역 -->
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />

		<!-- NAVIGATION 영역 -->
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp" />

		<div id="wrapper">
			<div id="content">
				<!-- Content 영역 -->
				<div id="user">

					<!-- Login form -->
					<form id="login-form" name="LoginForm" method="POST"
						action="<%=request.getContextPath() %>/users">
						<input type="hidden" name="a" value="login"> <label
							class="block-label" for="email">이메일</label> <input type="text"
							name="email"> <label class="block-label" for="password">비밀번호</label>
						<input type="password" name="password"> <input
							type="submit" value="로그인">

					</form>

				</div>
			</div>
		</div>

		<!-- FOOTER 영역 -->
		<%@ include file="/WEB-INF/views/includes/footer.jsp"%>
	</div>
</body>
</html>