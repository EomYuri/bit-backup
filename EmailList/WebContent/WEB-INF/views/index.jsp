<%@page import="com.bitacademy.emaillist.vo.EmailVo"%>
<%@page import="java.util.List"%>
<%@page import="com.bitacademy.emaillist.dao.EmailListDao"%>
<%@page import="com.bitacademy.emaillist.dao.EmailListDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//	dbUser, dbPass 컨텍스트 파라미터로부터 받아옴
/*
ServletContext context = getServletContext();
String dbUser = context.getInitParameter("dbUser");
String dbPass = context.getInitParameter("dbPass");
*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메일링 리스트</title>
<link type="text/css"
	rel="stylesheet"
	href="<%= request.getContextPath() %>/css/index.css"/>
<script type = "text/javascript"
	src="<%= request.getContextPath() %>/javascript/form.js">
</script>
</head>
<body>
<%
//	DAO로부터 리스트를 받아와봅시다.
/*
EmailListDao dao = new EmailListDaoImpl(dbUser, dbPass);
List<EmailVo> list = dao.getList();
*/
// List<EmailVo> list = (List<EmailVo>)request.getAttribute("list");
%>


	<div id="container">
		<div class="header">
			<h1>메일링 리스트(서블릿 버전)</h1>
		</div>
		<div class="content">
			<!-- 내용 추가: 리트스 -->

<%-- for (EmailVo vo: list){ --%>
		<c:forEach items="${list }" var="vo"
					varStatus="status">
			<p>[status: ${status.index }, ${status.count }]</p>
			<table class="list_item">
				<tr>
					<th>성</th>
					<td>${vo.lastName}<%--= vo.getLastName() --%></td>
				</tr>
				<tr>
					<th>이름</th>
					<td>${vo.firstName}<%--= vo.getFirstName() --%></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td>${vo.email}<%--= vo.getEmail() --%></td>
				</tr>	
				<tr class= "toolbar">
					<td colspan="2">
					<!-- 삭제를 위한 폼 -->
					<form method = "POST"
						action="<%= request.getContextPath()%>/el"
						onsubmit="return delete_email(this)">
						<input type="hidden" 
							name="a" 
							value="delete">
						<input type = "hidden"
							name = "no"
							value = "${vo.no}"><%--= vo.getNo() %>">
						<input type = "submit"
							value = "삭제">
					</form>
			</table>
<%-- } --%>
</c:forEach>
		</div>
		<div class="footer">
			<a href="<%= request.getContextPath() %>/el?a=form">
			추가 이메일 등록
			</a>
		</div>
	</div>

</body>
</html>