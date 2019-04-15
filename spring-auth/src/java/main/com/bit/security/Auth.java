package com.bit.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 	Java Annotation
 		일반적인 주석 : 특정 단어 및 문장(데이터)을 설명하기 위한 문장(데이터)
 			-> 데이터에 대한 데이터, 메타 데이터
 		자바 주석 : 소스 코드에 설정하는 메타 데이터
 		
 		Built-in Annotation
 		@Override
 			: 재정의가 됐는지 검증
 		@SuppressWarnings
 		 	: 컴파일러의 경고를 무시
 		 	
 		Meta Annotation
 		@Target
 			: 어노테이션의 적용 위치
 			ElementType.METHOD 	메소드
 			ElementType.TYPE 	메소드 외 클래스, 인터페이스 같은 선언문
 			ElementType.FIELD	멤버 변수 (두 개 이상 시 { } 그룹 지정)
 		@Retention
 			: 어노테이션의 적용 주기
 			RetentionPolicy.RUNTIME		실행 중
 			*동적 처리시에는 무조건 RUNTIME, 프로그램 종료시까지 계속 유지
 		
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {
	String role() default "user";
}
