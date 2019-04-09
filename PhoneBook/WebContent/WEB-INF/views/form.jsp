<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Address</title>
<link type="text/css" rel="stylesheet"
	href="<%= request.getContextPath() %>/css/users.css" />
<script type = "text/javascript"
	src = "<%= request.getContextPath() %>/javascript/form.js">
</script>

</head>
<div div="container">
  		<div class="header">
			<h1>새 주소 등록</h1>
		</div>
	
       
      <div id="content">
			<!-- Content 영역 -->
			<div>
			<form method="POST"
			id="insert-form" 
				action="<%= request.getContextPath() %>/"
				onsubmit="return checkForm(this)">
				<!-- 입력 폼 -->
				
				<label class = "block-label" for = "name">이름</label>
				<input type = "text" name = "name">
				
				<label class = "block-label" for = "hp">휴대전화</label>
				<input type = "text" name = "hp">
				
				<label class = "block-label" for = "tel">집전화</label>
				<input type = "text" name = "tel">
				
				<input type = "hidden" name = "a" value = "insert">
				<input type = "submit" value = "주소등록">
			</form>
		</div>
		<div class="footer">
			<a href="<%= request.getContextPath() %>/">
			목록 보기
			</a>
		</div>
      </div>
</div>
</html>