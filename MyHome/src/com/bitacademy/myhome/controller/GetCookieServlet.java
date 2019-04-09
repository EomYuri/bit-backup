package com.bitacademy.myhome.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/get")
public class GetCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 쿠키를 읽어와 봅시다
		PrintWriter writer = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		
		writer.println("<h1>Cookie 읽기</h1>");
		writer.println("<ul>");
		
		for(Cookie cookie: cookies) {
			writer.printf("<li>%s: %s</li>", 
					cookie.getName(), URLDecoder.decode(cookie.getValue(),"UTF-8"));
		}
		
		writer.println("</ul>");
	}

}
