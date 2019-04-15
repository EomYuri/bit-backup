
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
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
.content{
	background: #FAF4C0;
	border: 1px solid #000;
	height:200px;
}
.no{
	background:#D5D5D5;
	border: 1px solid #000;
}
.name{
	background:#B2EBF4;
	border: 1px solid #000;
}
input[type=submit]{
	background:#1DDB16;
	border:1px solid #000;
}
#write{
	background:#D4F4FA;
}
#list{
	background:#FFEBFE;
	text-align:center;
}
a:link { color: green; text-decoration: none; background:yellow; border:1px solid black}
a:visited { color: green; text-decoration: none;}
a:hover { color: red; text-decoration: underline;}
</style>
</head>
<body>
<%
	String HomePath = request.getContextPath();
%>

	<div id="write">
		<h1>방명록 작성</h1>
		<form method="post" action="<%=HomePath%>/write">
			<table>
				<tr>
					<td>
						이름
					</td>
					<td>
						<input type="text" name="name" placeholder="이름">
					</td>
				</tr>
				<tr>
					<td>
						비밀번호
					</td>
					<td>
						<input type="password" name="password">
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea name="content" ></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<input type="submit" value="작성">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<div id="list">
		<h1>방명록 리스트</h1>
		<a href="<%=HomePath%>/" >내림차순</a>
	 <c:forEach items="${list}" var="vo">
			<table>
				<tr>
					<td class="no">
						${vo.no }
					</td>
					<td class="name">
						${vo.name }
					</td>
				</tr>
				<tr>
					<td colspan="2" class="content">
						${vo.content }
					</td>
				</tr>
				<tr>
					<td>
						<form method="get" action="<%=HomePath%>/modify">
							<input type="hidden" name="no" value="${vo.no }">
							<input type="hidden" name="name" value="${vo.name }">
                			<input type="hidden" name="password" value="${vo.password }">
                			<input type="hidden" name="content" value="${vo.content }">
                			<input type="submit" value="수정">
           				</form>
					</td>
					<td>
						<form method="get" action="<%=HomePath%>/delete">
							<input type="hidden" name="no" value="${vo.no }">
                			<input type="hidden" name="password" value="${vo.password }">
                			<input type="submit" value="삭제">
           				</form>
					</td>
				</tr>
			</table>
		</c:forEach>
	</div>
</body>
</html>