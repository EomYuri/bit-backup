package com.bit.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;

import com.bit.vo.UserVo;

public class AuthInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request
							, HttpServletResponse response
							, Object handler
							) throws Exception{
		
		/*
		 [정상 수행 : 인터셉터 수행 후에 실제 실행할 타겟(목적지)]
		1. HandlerMethod 존재 여부
			단순 페이지 이동 시 또는 @RequestMapping이 된 메소드가 없을 경우
			더 이상 인증 과정을 수행하지 않고 true로 종료 후 정상 수행
		2. @Auth 설정 여부
			제어할 메소드(HandlerMethod)는 존재하지만 인증 접근 제어가 필요없는 경우
			auth == null 이면, 더 이상 인증 과정을 수행하지 말고 정상 수행
		3. 세션 확인을 통한 접근 제어
			[1단계] : 현재 세션 객체가 존재하는지
			@Auth 인증 관련 어노테이션이 붙어있다면 (null이 아니라면),
			현재 세션 정보가 존재하는지 판단하여 세션 정보가 없다면, 
			다른 페이지로 보내겠다.
			if(session == null){
				response.sendRedirect(
					request.getContextPath() + "이동할 페이지 요청 URL");
				return false;	// Controller로 도달하지 말고 종료! (정상 수행 X)
			}
			
			[2단계] : 현재 세션의 UserVo의 속성이 "authUser"인지 판단
			로그인 하지 않은 상태에서 회원 정보 수정 요청이 들어온다면, 
			로그인 폼 화면으로 강제 이동시켜라.
		4. 인증된 사용자
			위의 과정에서 중간에 반환되지 않은 경우, 
			HandlerMethod가 존재하고, 
			@Auth 설정이 되어있고, 
			session이 존재하며, 
			해당 session의 정보가 authUser라면, 
			정상 수행!
		
		*/
		// 1. handler 종류
		if(handler instanceof HandlerMethod == false) {
			return true;
		}
		
		// 2. @Auth 여부
		Auth auth = ((HandlerMethod)handler).getMethodAnnotation(Auth.class);
		if(auth == null) {
			return true;
		}
		
		// 3. 접근 제어 (User Session)
		HttpSession session = request.getSession();
		if(session == null) {
			response.sendRedirect(
					request.getContextPath() + "/user/loginform"); // 세션이 없다면 로그인화면으로 강제 이동
			return false; // 더 이상 진행하지 말고 종료
		}
		
		// (2). 존재하는 세션이 authUser인지 확인
		UserVo authUser = (UserVo)session.getAttribute("authUser");
		if(authUser == null) {
			response.sendRedirect(
					request.getContextPath() + "/user/loginform"); // 세션이 인증된 사용자가 아니라면 로그인화면으로 강제 이동
			return false; // 더 이상 진행하지 말고 종료
		}
		
		// 4. 인증된 사용자
		return true;
	}
}
