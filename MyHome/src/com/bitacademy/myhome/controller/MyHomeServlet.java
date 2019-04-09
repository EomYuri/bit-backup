package com.bitacademy.myhome.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyHome", urlPatterns = "/")

public class MyHomeServlet extends BaseServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp");
		rd.forward(req,resp);
		
	}

}

