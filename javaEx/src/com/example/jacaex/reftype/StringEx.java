package com.example.jacaex.reftype;
// 참조타임(String) 예제
public class StringEx {

	public static void main(String[] args) {
		String str = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		
		System.out.println("str == str2 ? " +
				(str == str2));
		System.out.println("str == str3 ? " +
				(str == str3));
		
		// 참조 타입의 ==, !=은 객체 주소를 비교하는 것이다.
		// 실제 내용의 비교는 .equals 메소드를 이용
		
		System.out.println("str.equals(str2) :" + str.equals(str2));
		System.out.println("str.equals(str3) :" + str.equals(str3));
		
		// 문자열 포매팅
		int total = 10;
		int eat = 3;
		String fruit = "사과";
		
		// 10개의 사과 중에서 3개를 먹었다.
		System.out.println(total+"개의 " +fruit+ " 중에서 " +eat+"개를 먹었다.");
		
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n",total,fruit,eat);
		
		// %d(10진수), %s(문자열), %f(실수형), %n(개행)
		
		// %f 형식문자열
		float PI = 3.14159f;
		// 파이값은 3.14159입니다.
		System.out.printf("파이값은 %f입니다%n",PI);
		System.out.printf("파이값은 %.3f입니다%n",PI);
		// 형식문자를 이용한 출력 재현
		

	}

}
