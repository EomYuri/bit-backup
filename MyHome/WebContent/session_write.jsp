<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session = "true" %>
<%
//	세션 객체의 생성
//	어떤 객체도 담을 수 있
session.setAttribute("sess1", "문자열 세션");
session.setAttribute("sess2", 2019);

//	세션 유효 시간
session.setMaxInactiveInterval(2 * 60 * 60);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션 변수 저장</h3>
	<p><a href = "session_read.jsp">
		세션 변수 확인
	</a>

</body>
</html>