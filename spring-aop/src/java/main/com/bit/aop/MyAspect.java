package com.bit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	// @Before
	// - 타겟 메소드가 호출되기 전 수행	
//	@Before("execution(MemberVo com.bit.aop.MemberService.find(..))")
	@Before("execution( * *..*.MemberService.*(..) )")
	public void beforeAdvice() {
		System.out.println("[before advice] Called...");
		
	}
	
	// @After
	// - 타겟 메소드가 호출된 후 수행
	// - 수행 성공 여부와 관계 없이 완료되면 수행
	@After("execution( * *..*.MemberService.*(..) )")
	public void afterAdvice() {
		System.out.println("[after advice] Called...");
	}
	
	// @AfterReturning
	// - 타겟이 정상적으로 반환 됐을 경우 수행
	@AfterReturning("execution( * *..*.MemberService.*(..) )")
	public void afterReturningAdvice() {
		System.out.println("[afterReturning advice] Called...");
	}
	
	// @AfterThrowing
	// - 타겟 메소드가 수행 중 예외를 던지게되면 수행
	@AfterThrowing("execution( * *..*.MemberService.*(..) )")
	public void afterThrowingAdvie() {
		System.out.println("[afterThrowing advice] Called...");
	}
	
	// @Around
	// - 어드바이스가 타겟인 메소드를 앞 뒤로 감싸서 호출 전과 호출 후를 구분
	// - proceed() 메소드를 호출하여 타겟 메소드를 수행!
	
	@Around("execution( * *..*.MemberService.*(..) )")
	public Object arroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
	System.out.println("[around advice : before] Called...");
	
	// pointcut 대상 메소드 호출
	// 전부 받기로 했으니 오브젝트 배열로 받아 처리!
	// 기존 타겟 메소드의 인자를 다시 전달! -> Citra
	Object[] parameters = { "Citra" };
	Object result = pjp.proceed(parameters);
	
	// 기존 타겟 메소드를 수행! -> OHSLOW
	// Object result = pjp.proceed();
	
	System.out.println("[around advice : after] Called...");
	
	return result;
	}
}
