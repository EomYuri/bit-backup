package com.bitacademy.phonebook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitacademy.phonebook.dao.PhoneBookDao;
import com.bitacademy.phonebook.dao.PhoneBookDaoImpl;
import com.bitacademy.phonebook.vo.PhoneBookVo;
// 서블릿 애너테이션 선언
@WebServlet(name = "PhoneBook", urlPatterns = "/")
public class PhoneBookServlet extends BaseServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// DAO로부터 list 받아오기
		// parameter a
		// a = "form" -> FORWARD
		String actionName = req.getParameter("a");

		if("form".equals(actionName)) {
			// 폼 페이지로 포워드
			RequestDispatcher rd = 
					getServletContext().getRequestDispatcher("/WEB-INF/views/form.jsp");
			rd.forward(req,resp);

		}else {
			PhoneBookDao dao = new PhoneBookDaoImpl(dbUser, dbPass);
			List<PhoneBookVo> list = dao.getList();
			req.setAttribute("list", list);

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(req, resp);


		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String actionName = req.getParameter("a");
		if("insert".equals(actionName)) {
			// 이메일 등록
			String name = req.getParameter("name");
			String hp = req.getParameter("hp");
			String tel = req.getParameter("tel");

			PhoneBookVo vo = new PhoneBookVo(name, hp, tel);
			PhoneBookDao dao = new PhoneBookDaoImpl(dbUser, dbPass);

			boolean success = dao.insert(vo);

			if(success) {
				System.out.println("INSERT SUCCESS!");
			}else {
				System.err.println("INSERT FAILED!");
			}
			// 각 상황별로 메세지를 보여줘야 하겠지만
			resp.sendRedirect(req.getContextPath() + "/");

		}else if("delete".equals(actionName)) {
			// 이메일 삭제
			String id = req.getParameter("id");
			PhoneBookDao dao = new PhoneBookDaoImpl(dbUser, dbPass);

			boolean success = dao.delete(Long.valueOf(id));

			if(success) {
				System.out.println("DELETE SUCCESS!");
			}else {
				System.err.println("DELETE FAILED!");
			}
			// 각 상황별로 메세지를 보여줘야 하겠지만
			resp.sendRedirect(req.getContextPath() + "/");
			
		}else if("search".equals(actionName)) {
			// 검색
			String name = req.getParameter("name");
			PhoneBookDao dao = new PhoneBookDaoImpl(dbUser, dbPass);

			List<PhoneBookVo> list = dao.search(name);
			
			req.setAttribute("list", list);
			req.setAttribute("searchname", name);
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(req, resp);

			// 각 상황별로 메세지를 보여줘야 하겠지만
//			resp.sendRedirect(req.getContextPath() + "/");
		}
	}
	
}
