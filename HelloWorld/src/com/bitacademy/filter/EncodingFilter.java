package com.bitacademy.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// 서블릿 필터: javax.servlet.Filter를 구현
public class EncodingFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("[Filter] destroy");
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("[Filter] doFilter");
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h4>필터 적용 전</h4>");
		// 필터 체인에 다음 필터 적용
		chain.doFilter(req, resp);
		// 필터 체인 적용 후 작업
		writer.println("<h4>필터 적용 후</h4>");
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) 
			throws ServletException {
		System.out.println("[Filter] init");
	}
	

}
