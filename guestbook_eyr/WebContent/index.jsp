<%@page import="guestbookVo.guestbookVo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="gusetbookDAO.guestbookDao"%>
<%@page import="gusetbookDAO.guestbookDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>
<% 
	String Home = request.getContextPath();

	guestbookDao dao = new guestbookDaoImpl("bituser", "bituser");
	
	List<guestbookVo> list = dao.getList();
%>
<div style="margin: 10px auto; width: 500px">
<form action="<%=Home %>/write.jsp" method="POST">
	<table style="border: 1px solid #666">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" id="name"></td>
			<th>비밀번호</th>
			<td><input type="password" name="password" id="password"></td>
			<td><input type="submit" value="등록" style="margin: 5px 5px"></td>
		</tr>
		<tr>
			<td colspan="5"><textarea style="width:450px; margin: 5px 25px; height: 100px" name="content"></textarea></td>
		</tr>
	</table>
</form>
</div>

<%
	for(int i = 0; i< list.size(); i++){
		guestbookVo vo = list.get(i);
%>
	<div style="margin: 10px auto; width: 500px">
	<table style="width: 513px; border: 1px solid #666">
		<tr>
			<th>이름</th>
			<td><%= vo.getName()%></td>
			<td>
				<form action="<%=Home %>/deleteform.jsp" method="POST">
					<input type="hidden" name="password" value="<%=vo.getPassword() %>">
					<input type="hidden" name="no" value="<%= vo.getNo() %>">
					<input type="submit" value="X">
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="3" style="text-align:center"><%=vo.getContent() %></td>
		</tr>
	</table>
	</div>
<%	
	}
%>


</body>
</html>