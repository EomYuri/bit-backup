<%@page import="com.bitacademy.emaillist.dao.EmailListDao"%>
<%@page import="com.bitacademy.emaillist.dao.EmailListDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 컨텍스터 파라미터
ServletContext context = getServletContext();
String dbUser = context.getInitParameter("dbUser");
String dbPass = context.getInitParameter("dbPass");

// 삭제하기 위한 PK (no)
String no = request.getParameter("no");

EmailListDao dao = new EmailListDaoImpl(dbUser, dbPass);
boolean success = dao.delete(Long.valueOf(no));

if(success){
	response.sendRedirect(request.getContextPath());
}else{
	%>
	<h1>EROOR</h1>
	<p>Sorry, 지우지 못했습니다</p>
	<%
}
%>