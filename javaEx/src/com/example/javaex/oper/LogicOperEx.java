package com.example.javaex.oper;

// 관계연산과 논리연산
public class LogicOperEx {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 3;

		// 비교연산
		// >, <, >=, <=
		// == : equal, != not equal
		System.out.println(n1>n2);
		System.out.println(n1==n2); // equal?
		System.out.println(n1!=n2); // not equal?

		// 논리연산
		// AND(&&), OR(||), NOT(!)
		System.out.println(n1>n2 && n1<n2); // AND
		System.out.println(n1>n2 || n1<n2); // OR
		System.out.println(n1>n2);
	}

}
