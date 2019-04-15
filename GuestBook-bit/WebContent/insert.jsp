<%@page import="dao.GuestBookDaoImpl"%>
<%@page import="dao.GuestBookDao"%>
<%@page import="guestbook_spring.vo.GuestVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 요청 인코딩 설정
request.setCharacterEncoding("UTF-8");
// 파라미터 확인
/*
Enumeration<String> paramNames = request.getParameterNames();

while(paramNames.hasMoreElements()){
	String paramName = paramNames.nextElement();
	String paramValue = request.getParameter(paramName);
	%><p><%= paramName %>: <%= paramValue %></p>
	<%
}
*/

// 컨텍스트 초기화 파라미터 불러오기
ServletContext context = getServletContext();
String dbUser = context.getInitParameter("dbUser");
String dbPass = context.getInitParameter("dbPass");

// 폼 정보 받아오기
String name = request.getParameter("name");
String password = request.getParameter("password");
String content = request.getParameter("content");

GuestVo vo = new GuestVo(name, password, content);

GuestBookDao dao = new GuestBookDaoImpl(dbUser, dbPass);
boolean success = dao.insert(vo);

if(success){
	// 리스트 페이지로 돌려보냄
	response.sendRedirect(request.getContextPath());
}else{
	// 오류 메세지를 출력%>
	<h1>ERROR</h1>
	<p>데이터를 입력 중 오류가 발생했습니다.</p>
	<% 
}

%>

