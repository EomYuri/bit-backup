package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbookVo.guestbookVo;
import gusetbookDAO.guestbookDao;
import gusetbookDAO.guestbookDaoImpl;

@WebServlet("/")
public class ListServlet extends BaseServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String Home = req.getContextPath();

		guestbookDao dao = new guestbookDaoImpl("bituser", "bituser");
		
		List<guestbookVo> list = dao.getList();
		
		req.setAttribute("Home", Home);
		req.setAttribute("list", list);
		
		RequestDispatcher rd = req.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String Home = req.getContextPath();
		req.setAttribute("Home", Home);

		guestbookDao dao = new guestbookDaoImpl("bituser", "bituser");
		
		String a = req.getParameter("a");
		
		if(a.equals("write")) {
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			String content = req.getParameter("content");
			
			guestbookVo vo = new guestbookVo(name, password, content);
			
			boolean success = dao.insert(vo);
			if(success){
				System.out.println("성공");
				resp.sendRedirect(req.getContextPath()+"/");
			}else{
				System.out.println("실패");
				resp.sendRedirect(req.getContextPath()+"/");
			}
		}else if(a.equals("deleteform")) {

			String password = req.getParameter("password");
			Long no = Long.parseLong(req.getParameter("no"));
			
			req.setAttribute("password", password);
			req.setAttribute("no", no);
			
			RequestDispatcher rd = req.getServletContext().getRequestDispatcher("/WEB-INF/deleteform.jsp");
			rd.forward(req, resp);
			
		}else if(a.equals("delete")) {

			Long no = Long.parseLong(req.getParameter("no"));
			String password = req.getParameter("password");
			String pass = req.getParameter("pass");


			if (password.equals(pass)) {

				boolean success = dao.delete(no);
				if (success) {
					System.out.println("성공");
					resp.sendRedirect(req.getContextPath() + "/");
				} else {
					System.out.println("실패");
					resp.sendRedirect(req.getContextPath() + "/");
				}
			}else{
				resp.sendRedirect(req.getContextPath() + "/");
			}
		}
	}
	

}
