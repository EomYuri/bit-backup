package com.example.javaex.var;

// 실수형 자료형
public class FloatDoubleEx {

	public static void main(String[] args) {
		// 선언
		float floatVar;
		double doubleVar;
		
		// 할당 -> 정밀도 체크
		floatVar = 0.12345678901234567890F; // F 추가
		doubleVar = 0.12345678901234567890;

		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		
		// e 사용 표기법
		floatVar = 3E10F;
		doubleVar = 3e10;
		
		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		
		// 유의 : 정밀도를 포기하고 표현 범위 넓힘
		System.out.println(0.1*3);

	}

}
