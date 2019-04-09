<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제 3번</title>

<script src="../javascript/jquery/jquery-1.9.0.js"></script>
<script>

	
	$(document).ready(function(){
		$("#button").click(function(){ //확인 버튼 누르면 자동 실행
			
			//전달할 데이터
			var query = {name:$("#name").val()};
		
			$.ajax({
				type: "POST",
				url: "ex07-03Pro.jsp",
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
		<label for="name">이름</label>
			<input type="text" name="name" id="name">
			<br/>
		<button id="button">처리</button>
		<p>결과</p>
		
		<div id="result" style="width:200px;
								height:100px;
								border:5px double #6699FF">
		</div>
		
		
</body>
</html>