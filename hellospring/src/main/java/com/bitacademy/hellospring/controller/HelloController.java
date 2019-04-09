package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	// 메서드 단독 매핑
	@RequestMapping("/hello")
	// ModelAndView -> 스프링이 처리하는 기본 객체
	public ModelAndView hello(@RequestParam String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello, " + name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	// /hello2
	// Return Type을 String-> 해당 뷰의 이름
	// 이 뷰로 포워딩을 시도
	@RequestMapping("/hello2")
	public String hello() {
		return "WEB-INF/views/hello.jsp";
	}
	
	// 만약에 뷰로 포워딩하지 않고 직접 문자열을 출력하고자 할 경우
	// @ResponseBody
	@ResponseBody
	@RequestMapping("/hello3")
	public String hello3() {
		return "<H1>hello3</>";
	}
}

