package Controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public abstract class BaseServlet extends HttpServlet {
    protected String dbUser = null;
    protected String dbPass = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        ServletContext context = getServletContext();
        dbUser = context.getInitParameter("dbUser");
        dbPass = context.getInitParameter("dbPass");
    }
}


