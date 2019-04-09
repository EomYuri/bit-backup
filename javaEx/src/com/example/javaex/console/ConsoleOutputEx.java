package com.example.javaex.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// System.out.print : 개행하지 않음
		// System.out.println : 개행
		// System.out.printf : 포맷 문자열 출력
		
		System.out.print("Hello"); // 개행 X
		System.out.println("Java"); //개행 O

	
		// 이스케이프 문자
		System.out.println("Hello\nJava"); // 개행 
		System.out.println("Hello\tJava"); // 탭
		// Hello, "Java"
		System.out.println("Hello, \"Java\"");
		
		// 문자열 내 \ 써야되는 경우
		String dir = "c:\\windows\\system32\\cmd";
		System.out.println(dir);
		
		
		
	}

}
