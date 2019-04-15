package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	// 회원 정보 수정은 인증된 사용자이어야만 한다.
	// @Auth를 붙여 로그인 세션 인증 과정을 수행하도록! (AuthInterceptor)
	@RequestMapping("/modifyform")
	public String modify() {
		System.out.println("UserController modify() Method Called...");
		return "WEB-INF/views/modifyform.jsp";
	}
	
	// 유저 게시판은 유저 인증이 필요 없다.
	// @Auth를 붙이지 않는다.
	@RequestMapping("/userlist")
	public String userList() {	// HandlerMethod
		System.out.println("UserController userList() Method Called...");
		return "WEB-INF/views/userlist.jsp";
	}
}
