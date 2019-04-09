package com.example.javaex.oper;

// 3항 연산자 : 조건 연산자
public class ConditionalOperEx {

	public static void main(String[] args) {
		int a = 10, b = 30;
		boolean result;
		
		// a는 짝수인가?
		result = a % 2 == 0? true : false;
		System.out.println(a+"는 짝수? "+result);
		
		int score = 85;
		// 80점 이상이면 GOOD
		// 50점 미만이면 FAIL
		// 그 사이값이면 PASS
		String message;
		
		message = score >= 80? "GOOD":
			score < 50 ? "FAIL" : "PASS";
		System.out.println(message);
	}

}
