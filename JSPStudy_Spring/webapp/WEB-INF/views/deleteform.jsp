<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 삭제</title>
<style type="text/css">
h1{
	text-align:center;
}
table{
	margin : 5px auto;
	width : 500px;
	text-align: center;
}
</style>
</head>
<body>
<%
String HomePath = request.getContextPath();
%>

<h1>방명록 삭제</h1>
<form method="post" action="<%=HomePath%>/delete">
	<input type='hidden' name="no" value="${vo.no}">
    <input type='hidden' name="password" value="${vo.password}">
    <!-- 받아온 번호, password를 넣어서 보내야함 -->
	<table>
       <tr>
           <td>비밀번호 입력 </td>
           <td><input type="password" name="inpass"></td>
           <td><input type="submit" value="삭제"></td>
           <td><a href="<%=HomePath%>/list.jsp">메인으로</a></td>
       </tr>
	</table>
</form>
</body>
</html>