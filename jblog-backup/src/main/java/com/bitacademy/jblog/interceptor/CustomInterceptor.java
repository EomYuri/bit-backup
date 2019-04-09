package com.bitacademy.jblog.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CustomInterceptor implements HandlerInterceptor {
	// 로거 설정
	private static final Logger logger = LoggerFactory.getLogger(CustomInterceptor.class);
	
	// 컨트롤러가 호출되기 이전에 먼저 가로채기
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 리턴 값이 false이면 뒤쪽으로 제어를 넘기지 않음
		// 리턴 값이 true이면 뒤쪽으로 요청과 응답 객체를 넘김
		logger.info("CustomInterceptor::preHandle");
		return true;
	}
	
	// 컨트롤러 수행 후
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		logger.info("CustomInterceptor::postHandle");

	}

	// 컨트롤러 수행 후, 뷰 작업 완료된 이후
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		logger.info("CustomInterceptor::afterCompletion");
	}

}
