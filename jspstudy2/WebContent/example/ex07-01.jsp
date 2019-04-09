<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제 1번</title>

<script src="../javascript/jquery/jquery-1.9.0.js"></script>
<script>

	
	$(document).ready(function(){
		$("#button").click(function(){ //확인 버튼 누르면 자동 실행
			
			//전달할 데이터
			var query ={id:$("#id").val(), password:$("#password").val()};
		
			$.ajax({
				type: "POST",
				url: "process.jsp",
				data: query,
				success: function(data){
					$("#result").html(data);
				}
			});
			
		});
	});

	
	
</script>


</head>
<body>
		<p>아이디와 비밀번호 입력</p>
		<br/>
		<label for="id">아이디</label>
			<input type="text" name="id" id="id">
			<br/>
		<label for="password">비밀번호</label>
			<input type="password" name="password" id="password">
			<br/>
		<button id="button">확인</button>
		<p>결과</p>
		
		<div id="result" style="width:200px;
								height:200px;
								border:5px double #6699FF">
		</div>
		
		
</body>
</html>