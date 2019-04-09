<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 정보 확인</title>
</head>
<body>
	<h1>Request Info</h1>
	<ul>
		<li>Request Method:
		<%= request.getMethod() %>
		</li>
		<li>Context path:
		<%= request.getContextPath() %>
		</li>
	</ul>

	<h3>HTTP Header</h3>
	<ul>
	<% // 헤더 정보 확인
	Enumeration<String> headerNames =
		request.getHeaderNames();
	while(headerNames.hasMoreElements()) {
		String headerName = 
				headerNames.nextElement();
		%>
		<li><%= headerName %>:
			<%= request.getHeader(headerName) %>
		</li>
		<% 
	}
	%>
	</ul>
	
	<h3>Parameters</h3>
	<ul>
	<%
	Enumeration<String> paramNames = 
		request.getParameterNames();
	while (paramNames.hasMoreElements()){
		String paramName = 
				paramNames.nextElement();
		%>
		<li><%= paramName %> :
			<% if(paramName.equals("pet")){
				// 체크박스: 여러 개의 값이 설정될 수 있다
				String[] pets = 
					request.getParameterValues("pet");
		
				%><%= String.join(",", pets) %>
			<% } else { %>
			<%= request.getParameter(paramName) %>
			<% } %>
		</li>
	<% } %>
	
	</ul>
</body>
</html>