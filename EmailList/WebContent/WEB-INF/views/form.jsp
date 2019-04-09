<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css"
	rel="stylesheet"
	href="<%= request.getContextPath() %>/css/index.css"/>
<script type = "text/javascript"
	src = "<%= request.getContextPath() %>/javascript/form.js">
</script>
</head>
<div div="container">
		<div class="header">
			<h1>메일링 리스트 가입(서블릿 버전)</h1>
		</div>
		<div class="content">
			<!-- 내용 추가: 리스트 -->
			<p>메일링 리스트에 가입하려면 항목을 기입하고 등록 버튼을 클릭하세요</p>
			<form method="POST"
				action="<%= request.getContextPath() %>/el"
				onsubmit="return checkForm(this)">
				<input type = "hidden" 
					name = "a" 
					value = "insert">
				<fieldset>
					<label for="name">성</label>
					<input type="text"
						name="last_name"
						placeholder="이름을 입력하세요">
				</fieldset>
				<fieldset>
					<label for="first_name">이름</label>
					<input type="text"
						name="first_name"
						placeholder="이름을 입력하세요">
				</fieldset>
				<fieldset>
					<label for="email">이메일</label>
					<input type="text"
						name="email"
						placeholder="이메일을 입력하세요">
				</fieldset>
				<!-- 전송: SUBMIT -->
				<input type="submit" value="전송">
				<!-- 폼 초기화: RESET -->
				<input type="reset" value="다시작성">
			</form>
		</div>
		<div class="footer">
			<a href="<%= request.getContextPath() %>/">
			목록 보기
			</a>
	</div>

</body>
</html>