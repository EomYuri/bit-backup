<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input{
   display : block;
   margin-top: 10px;
}
</style>
</head>
<body>
   <form method="POST" action="/hellospring/user/join">
      <input type="text" name="name" placeholder="이름"/>
      <input type="password" name="password" placeholder="비밀번호" />
      <input type="test" name="email" placeholder="이메일" />
      <input type="submit" value="전송" />
   </form>
</body>
</html>