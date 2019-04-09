<%@page import="gusetbookDAO.guestbookDao"%>
<%@page import="gusetbookDAO.guestbookDaoImpl"%>
<%@page import="guestbookVo.guestbookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String content = request.getParameter("content");
	
	guestbookVo vo = new guestbookVo(name, password, content);
	guestbookDao dao = new guestbookDaoImpl("bituser", "bituser");
	
	boolean success = dao.insert(vo);
	if(success){
		System.out.println("성공");
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}else{
		System.out.println("실패");
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}

%>