<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="margin: 10px auto; width: 300px">
	<form action="<%=request.getContextPath() %>/delete" method="POST">
		<label>비밀번호: </label>
		<input type="password" name="pass">
		<br/>
		<input type="hidden" name="password" value="${vo.password }">
		<input type="hidden" name="no" value="${vo.no }>">
		
		<input type="submit" value="확인">
	</form>
</div>

</body>
</html>