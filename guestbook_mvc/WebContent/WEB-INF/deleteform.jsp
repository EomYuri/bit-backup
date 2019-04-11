<%@page import="guestbookVo.guestbookVo"%>
<%@page import="java.util.List"%>
<%@page import="gusetbookDAO.guestbookDaoImpl"%>
<%@page import="gusetbookDAO.guestbookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String Home = (String)request.getAttribute("Home");
	String password = (String)request.getAttribute("password");
	Long no = (Long)request.getAttribute("no");
%>
<div style="margin: 10px auto; width: 300px">
	<form action="<%=Home %>/" method="POST">
		<input type="hidden" name="a" value="delete">
		<label>비밀번호: </label>
		<input type="password" name="pass">
		<br/>
		<input type="hidden" name="password" value="<%=password %>">
		<input type="hidden" name="no" value="<%= no%>">
		
		<input type="submit" value="확인">
	</form>
</div>

</body>
</html>