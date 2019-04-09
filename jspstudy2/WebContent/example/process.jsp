 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<% String resultStr="";
   String id = request.getParameter("id");
   String password = request.getParameter("password");
   resultStr += "아이디:"+id+", 비밀번호:"+password;
   out.println(resultStr);
         

%>
</head>
<body>

</body>
</html>