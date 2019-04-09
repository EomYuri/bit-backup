package com.javaex.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;

		int num1After = ++num1+1;
		//		System.out.println(num1After);

		int num2After = num2++ + 1;
		//		System.out.println(num2After);

		System.out.println(num1After==num2After? "같음" : "다름");

		boolean result;

		/*		result = num1After==num2After? true:false;
		if (result == true) {
			System.out.println("같음");
		}else {
			System.out.println("다름");*/

		System.out.println("++num1 + 1 = "+num1After);
		System.out.println("num2++ + 1 = "+num2After);
	}

}
