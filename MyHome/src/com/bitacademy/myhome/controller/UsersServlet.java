package com.bitacademy.myhome.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitacademy.myhome.dao.UserDao;
import com.bitacademy.myhome.dao.UserDaoImpl;
import com.bitacademy.myhome.vo.UserVo;

@WebServlet("/users")
public class UsersServlet extends BaseServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String actionName = req.getParameter("a");
		
		// actionName에 따라 다른 폼을 보여줍시다
		if("joinform".equals(actionName)) {
			// joinform.jsp를 화면에 표시
			RequestDispatcher rd = 
					req.getRequestDispatcher("/WEB-INF/views/users/joinform.jsp");
			rd.forward(req, resp);
			
		}else if("joinsuccess".equals(actionName)) {
			// joinsuccess.jsp를 화면에 표시
			RequestDispatcher rd = 
					req.getRequestDispatcher("/WEB-INF/views/users/joinsuccess.jsp");
			rd.forward(req, resp);
		}else if("loginform".equals(actionName)) {
			RequestDispatcher rd = 
					req.getRequestDispatcher("/WEB-INF/views/users/loginform.jsp");
			rd.forward(req, resp);
		}else if("logout".equals(actionName)) {
			// 로그아웃: 세션 없애기
			HttpSession session = req.getSession();
			session.removeAttribute("authUser");
			session.invalidate();
			resp.sendRedirect(req.getContextPath());
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String actionName = req.getParameter("a");
		
		if("join".equals(actionName)) {
			// 가입 작업을 수행
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			String email = req.getParameter("email");
			String gender = req.getParameter("gender");
			
			// Vo 객체 생성
			UserVo userVo = new UserVo(name, password, email, gender);
			// TODO : 폼 데이터 검증 작업 수행
			UserDao dao = new UserDaoImpl(dbUser, dbPass);
			boolean success = dao.insert(userVo);
			
			if(success) { // 가입 성공
				resp.sendRedirect(req.getContextPath() + "/users?a=joinsuccess");
			}else {
				// 에러 메세지 출력
				resp.getWriter().println("<h1>Error: 가입실패</h1>");
			}
			
			
		}else if("login".equals(actionName)) {
			// 로그인 작업 수행
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			UserDao dao = new UserDaoImpl(dbUser, dbPass);
			UserVo vo = dao.getUser(email, password);
			
			if(vo != null) {
				// 세션에 유저 정보를 담기
				HttpSession session = req.getSession();
				session.setAttribute("authUser", vo);
				resp.sendRedirect(req.getContextPath());
			}else {
				resp.sendRedirect(req.getContextPath() + 
						"/users?a=loginform&result=fail");
			}
		}
	}
	

}
