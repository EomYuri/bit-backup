<%@page import="gusetbookDAO.guestbookDao"%>
<%@page import="gusetbookDAO.guestbookDaoImpl"%>
<%@page import="guestbookVo.guestbookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	Long no = Long.parseLong(request.getParameter("no"));
	String password = request.getParameter("password");
	String pass = request.getParameter("pass");

	guestbookDao dao = new guestbookDaoImpl("bituser", "bituser");

	if (password.equals(pass)) {

		boolean success = dao.delete(no);
		if (success) {
			System.out.println("성공");
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		} else {
			System.out.println("실패");
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
	}else{
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	}
%>