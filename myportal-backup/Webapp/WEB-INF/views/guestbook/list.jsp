<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width=510 border=1>
	<tr>
		<td>[번호]</td>
		<td>이름</td>
		<td>등록일</td>
		<td>
			<a href="<%= request.getContextPath() %>/deleteform"
				삭제
			</a>
		</td>
	</tr>
	<tr>
		<td colspan=4>내용</td>
	</tr>
</table>

</body>
</html>