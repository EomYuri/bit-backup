package com.bit.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 	OOP (Object Oriented Programming)
 	 - 실제 프로그램 수행에 영향을 갖는 비즈니스 로직의 분리 (설계)
 	AOP (Aspect Oriented Programming)
 	 - 실제 실행과는 관련이 없는 부가적인 기능 (로깅, 보안, 트랜잭션)들의 분리
 	 - 매번 기록했던 로그 소스들을 따로 분리하여 필요한 부분에 적용
 	 
 	AOP의 주요 개념
 		Target
 			- 부가기능을 부여할 대상
 			
 		Join Point
 			- 어드바이스가 적용될 포인트(위치, 시점)
 			- 메소드 호출 전/후, 메소드 실행 중, 클래스 초기화 및 객체 생성 시점
 			
 		Point Cut
 			- 어떤 클래스의 어느 Join Point를 사용할 것이 판별
 			- 어드바이스를 적용할 타겟을 선정
 			- 원하는 패키지 -> 클래스 네임 -> 메소드
 			
 		Advice
 			- 실제 부가기능에 대한 구현체
 			- 적용될 타겟에 영향을 미치지 않고, 부가기능만 수행
 			- 특정 Join Point에 실행되는 코드
 			- before, after, around
 			
 		Aspect
 			- 핵심기능에 독립된 부가기능을 적용하는 모듈
 			- 부가될 구현체인 Advice와 적용할 타겟인 Point Cut의 조합
 			
 		Proxy
 			- 타겟을 감싸는 형태
 			- 호출자가 타겟을 호출하면 프록시가 호출되는 형태
 			- 타겟보다 먼저 호출되어 선/후 처리 작업 수행
 			
 		Weaving
 			- 타겟에 Aspect(Point Cut, Advice)를 적용하여 감싸는 과정
 			- Point Cut에 의해 결정된 Join Point에 실제 수행 구현체인 Advice를 적용
 			
 			
 */



public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		MemberService ms = ctx.getBean(MemberService.class);
		MemberVo vo = ms.find("OHSLOW");
		System.out.println(vo);
	}

}
