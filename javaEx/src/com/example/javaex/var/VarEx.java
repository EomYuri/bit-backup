package com.example.javaex.var;

public class VarEx {
	public static void main(String[] args) {
		// 식별자 규칙
		// 문자, 숫자, _, $
		// 숫자로 시작하면 안됨
		
		// 변수명 관례 : 
		// 첫 글자를 소문자로
		int myAge; // 선언
		myAge = 24; //초기화
		
		String myName = "엄유리"; // 선언과 동시 초기화
		
//		myAge = "엄유리" //선언된 변수는 타입변경 X
		
		System.out.println(myAge);
		System.out.println(myName);
		
		// 여러 변수를 한꺼번에 선언할 때
		int v1 = 10, v2 = 20, v3 = 30;
		
		//같은 값을 동시에 여러 변수에 할당할 때
		v1 = v2 = v3 = 100;
		
		System.out.println(v2);
	}

}
