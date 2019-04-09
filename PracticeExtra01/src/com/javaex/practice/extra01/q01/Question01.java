package com.javaex.practice.extra01.q01;

public class Question01 {
	public void printAnswer(int toNum) {
		

		for(int i = 0; i<=toNum; i++) {
			if(i%2==0||i%3==0) {
				System.out.printf("*");
			}else {
				System.out.printf("%d",i);
			}
		}
		System.out.println();
	}
		
}
