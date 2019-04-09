<%@page import="java.util.List"%>
<%@page import="com.bitacademy.phonebook.dao.PhoneBookDaoImpl"%>
<%@page import="com.bitacademy.phonebook.dao.PhoneBookDao"%>
<%@page import="com.bitacademy.phonebook.vo.PhoneBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>주소록</title>
<link type="text/css" rel="stylesheet"
	href="<%= request.getContextPath() %>/css/index.css" />
<script type="text/javascript"
	src="<%= request.getContextPath() %>/javascript/form.js">
</script>
</head>
<body>
	<%
//	DAO로부터 리스트를 받아와봅시다.
/*
PhoneBookDao dao = new PhoneBookDaoImpl(dbUser, dbPass);
List <PhoneBookVo> list = dao.getList();
*/
List<PhoneBookVo> list = (List<PhoneBookVo>)request.getAttribute("list");
String name = (String)request.getAttribute("searchname");
%>

	<div id="container">
		<div class="header">
			<h1>목록
			<% if(name != null){%>
				(검색어 :
				<%=name %>
				)
			<% }%>
			</h1>
		</div>
		<div>
				
				<form method="POST"
							action="<%= request.getContextPath()%>/"
							onsubmit="return search(this)">
							<input type="hidden" 
							name="a" 
							value="search">
							<label for = "name">검색어</label>
							<input type = "text" name = "name">
						<input type = "submit"
							value = "검색">
						</form>
		</div>
		<div class="content">
			<!-- 내용 추가: 리트스 -->
			
			<table class="list_item" >
				<tr>
					<th>이름</th>
					<th>휴대전화</th>
					<th>전화번호</th>
					<th>도구</th>
				</tr>
				<% for (PhoneBookVo vo: list){ %>
				<tr align = "center">
					<td><%= vo.getName() %></td>
					<td><%= vo.getHp() %></td>
					<td><%= vo.getTel() %></td>
					<td class="toolbar">
						<!-- 삭제를 위한 폼 -->
						<form method="POST"
							action="<%= request.getContextPath()%>/"
							onsubmit="return delete_id(this)">
							<input type="hidden" 
							name="a" 
							value="delete">
							<input type = "hidden"
							name = "id"
							value = "<%= vo.getId() %>">
						<input type = "submit"
							value = "삭제">
						</form>
					</td>
				</tr>
				<% } %>
			</table>
			
		</div>
		<div class="footer">
			<a href="<%= request.getContextPath() %>/?a=form"> 새 주소 추가 </a>
		</div>
	</div>

</body>
</html>
