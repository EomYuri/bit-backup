<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스프링 테스트</title>
</head>
<body>

<div style="margin: 10px auto; width: 500px">
<form action="<%=request.getContextPath() %>/" method="POST">
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


	<div style="margin: 10px auto; width: 500px">
	<c:foreach items="${list }" var="vo">
	
	
	<table style="width: 513px; border: 1px solid #666">
		<tr>
			<th>이름</th>
			<td>${vo.name }</td>
			<td>
				<form action="<%=request.getContextPath() %>/" method="POST">
					<input type="hidden" name="a" value="deleteform">
					<input type="hidden" name="password" value="${vo.password }">
					<input type="hidden" name="no" value="${vo.no }">
					<input type="submit" value="X">
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="3" style="text-align:center">${vo.content }</td>
		</tr>
	</table>
	</div>
</c:foreach>


</body>
</html>