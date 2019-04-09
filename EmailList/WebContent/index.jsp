<%@page import="com.bitacademy.emaillist.vo.EmailVo"%>
<%@page import="java.util.List"%>
<%@page import="com.bitacademy.emaillist.dao.EmailListDao"%>
<%@page import="com.bitacademy.emaillist.dao.EmailListDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//	dbUser, dbPass 컨텍스트 파라미터로부터 받아옴
ServletContext context = getServletContext();
String dbUser = context.getInitParameter("dbUser");
String dbPass = context.getInitParameter("dbPass");

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
EmailListDao dao = new EmailListDaoImpl(dbUser, dbPass);
List<EmailVo> list = dao.getList();
%>


	<div id="container">
		<div class="header">
			<h1>메일링 리스트</h1>
		</div>
		<div class="content">
			<!-- 내용 추가: 리트스 -->
<% for (EmailVo vo: list){ %>
			<table class="list_item">
				<tr>
					<th>성</th>
					<td><%= vo.getLastName() %></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><%= vo.getFirstName() %></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><%= vo.getEmail() %></td>
				</tr>	
				<tr class= "toolbar">
					<td colspan="2">
					<!-- 삭제를 위한 폼 -->
					<form method = "POST"
						action="<%= request.getContextPath()%>/delete.jsp"
						onsubmit="return delete_email(this)">
						<input type = "hidden"
							name = "no"
							value = "<%= vo.getNo() %>">
						<input type = "submit"
							value = "삭제">
					</form>
			</table>
<% } %>
		</div>
		<div class="footer">
			<a href="<%= request.getContextPath() %>/form.jsp">
			추가 이메일 등록
			</a>
		</div>
	</div>

</body>
</html>