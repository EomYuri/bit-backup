<%@page import="java.util.List"%>
<%@ page language="java"
		contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<h1>방명록</h1>
	
	<form action="<%= request.getContextPath() %>/add.jsp" 
		method="POST">
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="pass"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	<br/>
	
	<table width=510 border=1>
		<tr>
			<td>[번호]</td>
			<td>이름</td>
			<td>등록일</td>
			<td>
				<a href="<%= request.getContextPath() %>/deleteform.jsp?no="></form>
					삭제
				</a>
			</td>
		</tr>
		<tr>
			<td colspan=4>내용</td>
		</tr>
	</table>
        <br/>
   
	
</body>
</html>