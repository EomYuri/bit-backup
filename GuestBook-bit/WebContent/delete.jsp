<%@page import="dao.GuestBookDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="dao.GuestBookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//dbUser, dbPass 컨텍스트 파라미터로부터 받아옴
ServletContext context = getServletContext();
String dbUser = context.getInitParameter("dbUser");
String dbPass = context.getInitParameter("dbPass");

//삭제하기 위한 PK (no)
String no = request.getParameter("no");
response.getWriter().println("no:"+no);

GuestBookDao dao = new GuestBookDaoImpl(dbUser, dbPass);
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
