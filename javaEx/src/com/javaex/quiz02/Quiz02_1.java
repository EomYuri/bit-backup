package com.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		boolean result1, result2;

		/*
		 * result1 = a % 2 == 0? true : false; System.out.println("a는 짝수입니까?");
		 * System.out.println(result1); System.out.println();
		 * 
		 * result2 = b % 3 == 0 ? true : false; System.out.println("b는 3의 배수입니까?");
		 * System.out.println(result2); System.out.println();
		 * 
		 * 
		 * boolean r1; r1 = result1 && result2;
		 */
		
		boolean r1 = a%2==0 && b%3==0;
		System.out.println(r1);

		System.out.println();

		char r2=(char)(c+4);
		System.out.println(r2);

	}
}
