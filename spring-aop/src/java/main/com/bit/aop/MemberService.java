package com.bit.aop;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
	/*
	 	AOP 예제의 비즈니스 로직
	 	순수 비즈니스 로직만 존재한다.
	 	제 3자가 바라보는 형태로 AOP의 적용 여부가 
	 	본 입장에서는 판단이 어렵다. 보이지 않는다.
	 */
//	@SuppressWarnings("unused")
	public MemberVo find(String name) {
		System.out.println(name + " -> find() Method Called...");
		
		// 강제 예외 발생!
//		if(true) {
//			throw new RuntimeException("My Exception");
//		}
		
		return new MemberVo(name);
	}

}
