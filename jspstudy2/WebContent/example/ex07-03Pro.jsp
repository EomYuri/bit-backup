 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<% 
   String name = request.getParameter("name");
   if(name.equals("김개동")){
	  out.println("관리자님 안녕하세용");
   }else{
	   out.println("회원님 안녕하세용");
   }
         
%>
</head>
<body>

</body>
</html>