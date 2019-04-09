<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제 2번</title>

<script src="../javascript/jquery/jquery-1.9.0.js"></script>
	<script>
		$(document).ready(function(){
			//로드 버튼 누르면 ex07-01.jsp 페이지 실행
			$("#button").click(function(){
				$("#page").load("ex07-01.jsp");
			});
		});

	</script>
</head>
<body>
	<button id ="button">로드</button>
	<div id = "page"></div>
</body>
</html>