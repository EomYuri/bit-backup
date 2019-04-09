<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session = "true" %>

   <div id="header">
      <h1>My Homepage</h1>
      <ul>
      <!-- 로그인된 경우의 메뉴 -->
      <%--
      	<li><a href = "<%= request.getContextPath() %>/users?a=logout">
      		로그아웃</a></li>
      	<li>님 안녕하세요</li>
      	--%>
      <!-- 로그인 안된 경우의 메뉴 -->
      	<li><a href = "<%= request.getContextPath() %>/users?a=loginform">
      		로그인</a></li>
      	<li><a href = "<%= request.getContextPath() %>/users?a=joinform">
      		회원가입</a></li>
      </ul>
    </div> <!-- /header -->