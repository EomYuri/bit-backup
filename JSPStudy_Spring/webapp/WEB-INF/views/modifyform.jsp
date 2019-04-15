<%@page import="spring.vo.GuestVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 수정</title>
<style type="text/css">
body {
	margin: 0 auto;
}

h1{
	text-align:center;
}

table{
	margin : 5px auto;
	width : 400px;
	text-align: center;
}

form {
	text-align: center;
}

div {
	border: 1px solid #000;
	width: 500px;
	margin : 5px auto;
}
textarea{
	width: 400px;
	height: 150px;
}
input[type=submit]{
	background:#1DDB16;
	border:1px solid #000;
}
#modify{
	background:#D4F4FA;
}
</style>
</head>
<body>
	<%		
		String HomePath = request.getContextPath();
	    //기존 글의 정보를 가져와서 폼에 띄워주기 위해 파라미터로 받아옴
	%>
	<div id="modify">
		<h1>방명록 수정</h1>
		<form method="post" action="<%=HomePath%>/modify">
			<input type="hidden" name="no" value="${vo.no}">
			<input type="hidden" name="password" value="${vo.password}">
			<table>
				<tr>
					<td>
						이름
					</td>
					<td>
						<input type="text" name="name" value="${vo.name}">
					</td>
				</tr>
				<tr>
					<td>
						비밀번호
					</td>
					<td>
						<input type="password" name="inpass" placeholder="비밀번호 검사">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea name="content" >${vo.content }</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="작성">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>