<%@page import="vo.GuestVo"%>
<%@page import="java.util.List"%>
<%@page import="dao.GuestBookDao"%>
<%@page import="dao.GuestBookDaoImpl"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/index.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/javascript/form.js">
	
</script>
</head>
<body>
	<%
		//	DAO로부터 리스트를 받아와봅시다.
		GuestBookDao dao = new GuestBookDaoImpl(dbUser, dbPass);
		List<GuestVo> list = dao.getList();
	%>
	<div id="container">
		<div class="content">
			<!-- 내용 추가: 리트스 -->

			<form action="<%=request.getContextPath()%>/insert.jsp" method="POST"
				onsubmit="return checkForm(this)">

				<table class="list_item" border=1 width=600>
					<tr>
						<td>이름</td>
						<td><input type="text" name="name"></td>
						<td>비밀번호</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
					</tr>
					<tr>
						<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
					</tr>
				</table>
			</form>
			<br />
			</div>

			<%
				for (GuestVo vo : list) {
			%>
			<table width=640 border=1>
				<tr>
					<td><%=vo.getNo()%></td>
					<td><%=vo.getName()%></td>
					<td><%=vo.getReg_date()%></td>
					<td><a href="<%=request.getContextPath()%>/deleteform.jsp?no=<%= vo.getNo() %>">
							삭제</a></td>
				</tr>
				<tr>
					<td colspan=4><%=vo.getContent()%></td>
				</tr>
			</table>
			<br />
			<%
				}
			%>
		</div>
		<br />
</body>
</html>