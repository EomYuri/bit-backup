package com.bitacademy.hellospring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class NonAnnotationController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "<h1>Non Annotation Controller</h1>");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}

}
