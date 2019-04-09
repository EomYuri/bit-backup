import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
//	public class HttpServlet{
		// 초기화 파라미터
		String appName = null;
		String dbUser = null;
		String dbPass = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// init: 서블릿 초기화 - 서블릿이 첫번째 요청을 받을 때
		super.init(config);	// 삭제하지 맙시다
		
		System.out.println("[LifeCycle] init");
		
		// 컨텍스터 초기화 파라미터
		ServletContext context = getServletContext();
		appName = context.getInitParameter("appName");
		dbUser = context.getInitParameter("dbUser");
		dbPass = context.getInitParameter("dbPass");
		
		System.out.println("Application Name:" + appName);
		System.out.println("DBUSER:" + dbUser);
		System.out.println("DBPASS:" + dbPass);
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// service: 요청 메서드와 상관없이 요청을 처리
		System.out.println("[LifeCycle] service");
		
		// 서블릿 초기화 파라미터 읽어오기
		ServletConfig config = getServletConfig();
		String servletName = config.getInitParameter("servletName");
		String description = config.getInitParameter("description");
		
		System.out.println("서블릿 이름:" + servletName);
		System.out.println("설명:" + description);
		// 특정 메서드에 관련된 작업을 수행하고자 할 때
		// 분기 처리
		System.out.println("METHOD:" + req.getMethod());
		if(req.getMethod().contentEquals("GET")) {
			doGet(req, resp);
		}else if (req.getMethod().equals("POST")) {
			doPost(req, resp);
		}
		
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// GET 요청 처리
		String name = req.getParameter("name");
		if(name == null) {
//			name = "Anonymous";
			throw new ServletException("누구?");
		}
		// 응답 출력
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset = UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Hello Servlet</h1>");
		writer.printf("<p>Welcome, %s</p>",name);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("[LifeCycle]: doPost");
		
		// 요청 정보의 인코딩 변환
		req.setCharacterEncoding("UTF-8");
		
//		String lastName = req.getParameter("last_name");
//		String firstName = req.getParameter("first_name");
		
		// 출력
//		resp.setCharacterEncoding("UTF-8");
//		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>폼 데이터 처리</h1>");
//		writer.println("last_name: "+lastName);
//		writer.println("first_name: "+firstName);
		
		// request 객체 조금 더 알아보기
		writer.println("<ul>");
		Enumeration<String> params = req.getParameterNames();
		while(params.hasMoreElements()) {
			String paramName = params.nextElement();
			String paramValue = req.getParameter(paramName);
			
			writer.printf("<li>%s: %s</li>", paramName, paramValue);
		}
		writer.println("</ul>");
			
		
	}

	@Override
	public void destroy() {
		System.out.println("[LifeCycle] destroy");
		super.destroy();
	}
}
