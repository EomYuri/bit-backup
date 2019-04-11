package com.bitacademy.myportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.myportal.exception.DaoException;

@Controller
public class MainController {
	@RequestMapping({"/", "/main"})
	public String main() {
//		return "/WEB-INF/views/home.jsp";
		return "home";
	}
	
	//	오류가 발생되는 메서드
	@RequestMapping("/except")
	@ResponseBody
	public String except() {
		try {
			int result = 4 / 0;	//	ERROR
		} catch (Exception e) {
//			throw 
//				new RuntimeException("Main Controller Error");
			//	예외의 전환
			throw new DaoException("메인 컨트롤러에서 DB오류");
		}
		return "Exception Test";
	}
	/*
	//	Exception Handler
	@ExceptionHandler(RuntimeException.class) 
	@ResponseBody
	public String handleControllerExcept(RuntimeException e) {
		return "Exception: " + e.getMessage();
	}
	
	//	Exception Handler v2
	@ExceptionHandler(DaoException.class)
	public String handleControllerExcept(
		DaoException e, Model model) {
		model.addAttribute("name",
				e.getClass().getSimpleName());
		model.addAttribute("message",
				e.getMessage());
		return "exception/exception";
	}
	*/
}












