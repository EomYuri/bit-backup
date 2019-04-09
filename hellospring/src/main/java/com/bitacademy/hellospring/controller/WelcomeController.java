package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	@RequestMapping("/")
//	public ModelAndView home(@RequestParam("name") String name) {
	public ModelAndView home(@RequestParam
			(value="name", required=false,defaultValue="Anonymous")String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello, " + name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	// Path Variable의 사용
	// URL Path상의 일부로 파라미터값이 넘어오는 경우
	@RequestMapping("/pathvar/{name}/{no}")
	public ModelAndView pathparam(
		@PathVariable("name") String name,
		@PathVariable("no") Long no
		) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Name: "+ name + "No: " + no) ;
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	// String을 리턴타입으로 자븡면 ViewName 반환
	@RequestMapping("/withmodel")
	public String withmodel(ModelMap map) {
		map.addAttribute("message", "모델 맵");
		return "/WEB-INF/views/hello.jsp";
	}
			

}
