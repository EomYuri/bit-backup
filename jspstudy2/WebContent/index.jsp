<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>change</title>
</head>
<body>

<!-- 문장 선언 -->
<%
	String sen1 = "문장(文章)은 논리학에서 자유 변수를 갖지 않는 정식을 의미한다.";
	String sen2 = "문장(文章)은 불교에서 심불상응행법 가운데 하나인 구신(句身)을 말한다.";
	String sen3 = "문장(紋章)은 국가나 단체 또는 집안 따위를 나타내기 위하여 사용하는 상징적인 표지이다.";
%>

<!-- 문장 표시 -->
<div class="sentences" id="sentences" style="margin: auto" >

<p id="sen1" style="border: 1px solid #000;
			border-radius: 10px; 
			width: 400px;
			text-align: center;
			padding: 10px;
			margin: 0 auto">
<%= sen1 %>
</p>
<p id="sen2" style="border: 1px solid #000;
			border-radius: 10px; 
			width: 400px;
			text-align: center;
			padding: 10px;
			margin: 0 auto">
<%= sen2 %>
</p>
<p id="sen3" style="border: 1px solid #000;
			border-radius: 10px; 
			width: 400px;
			text-align: center;
			padding: 10px;
			margin: 0 auto">
<%= sen3 %>
</p>


</div>

<!-- 글자 색깔 변경 -->
<div class="up" style="width:200px; position:absolute; top:8px; left:50%">
	<form>
	<!-- 문장 고르기 -->
	<select name = "sens">
		<option name="pick" value="first">문장1</option>
		<option name="pick" value="second">문장2</option>
		<option name="pick" value="third">문장3</option>
	</select>
	
	<!-- 효과 고르기 -->
	<br><br><br>
	<input type="radio" name="color" value="red"/>red
	<input type="radio" name="color" value="blue"/>blue
	<input type="radio" name="color" value="green"/>green
	<br>
	<input type="submit" value="효과적용">
	
	</form>
</div>

<!-- 글자 크기 변경 -->
<div class="down">
	<form>
	<select name = "sens">
		<option name="pick" value="first">문장1</option>
		<option name="pick" value="second">문장2</option>
		<option name="pick" value="third">문장3</option>
	</select>
	
	<!-- 효과 고르기 -->
	<br><br><br>
	<input type="radio" name="size" value="10"/>10
	<input type="radio" name="size" value="20"/>20
	<input type="radio" name="size" value="30"/>30
	<br>
	<input type="submit" value="효과적용">
	</form>
</div>

<!-- 문장 순서 변경 -->
<div class="left">
<form>
	<select name = "sens">
		<option name="pick" value="first">문장1</option>
		<option name="pick" value="second">문장2</option>
		<option name="pick" value="third">문장3</option>
	</select>
	
	<!-- 효과 고르기 -->
	<br><br><br>
	<input type="radio" name="order" value="up"/>UP
	<input type="radio" name="order" value="down"/>DOWN
	<br>
	<input type="submit" value="효과적용">
	
	</form>
</div>

<div class="right">

<form>
	<select name = "sens">
		<option name="pick" value="first">문장1</option>
		<option name="pick" value="second">문장2</option>
		<option name="pick" value="third">문장3</option>
	</select>
	
	<!-- 효과 고르기 -->
	<br><br><br>
	<input type="radio" name="border" value="solid"/>Solid
	<input type="radio" name="border" value="dot"/>Dotted
	<input type="radio" name="border" value="none"/>None
	<br>
	<input type="submit" value="효과적용">
	
	</form>
</div>
</body>

<%
String pick = request.getParameter("pick");
String color = request.getParameter("color");
String size = request.getParameter("size");
String order = request.getParameter("order");
String border = request.getParameter("border");
%>
<%
if(pick.equals("first")){
	if(color.equals("red")){%>
	$('#sen1').css('color', red);
		
<% 	}
}
%>


</html>