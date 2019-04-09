<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session = "true" %>
<%
//	세션 지우기
session.removeAttribute("sess1");
session.removeAttribute("sess2");

//	세션 무효화(삭제)
session.invalidate();
response.sendRedirect("session_read.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>