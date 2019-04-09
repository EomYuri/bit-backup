<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%if(session.getAttribute("id")==null){	// 세션이 설정되지 않은 경우%>
	<form method="post" action="ex-result.jsp">
		<div id="unauth">
			<dl>
				<dd>
					<label for="id">아이디</label>
					<input type="text" id="id" name="id" placeholder="y00zl" autofocus required>
				</dd>
				<dd>
					<label for="pass">비밀번호</label>
					<input type="password" id="password" name="password" placeholder="1234" required>
				</dd>
				<dd>
					<input type="submit" value="로그인">
				</dd>
			</dl>
		</div>
	</form>
	<%}else{ // 세션 설정된 경우%>
	<form method="post" action="logout.jsp">
		<div id="auth">
			<p><%=session.getAttribute("id") %>님 안녕하세요.</p>
			<br/>
			<input type="submit" value="로그아웃">
		</div>
	</form>
	<%} %>
		
		
	

</body>
</html>