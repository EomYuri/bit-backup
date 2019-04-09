package com.example.javaex.conditional;

import java.util.Scanner;

// 조건문 IF 예제
public class IfElseEx {

	public static void main(String[] args) {
		// Scanner 열기
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();

		// num이 0인지, 양수, 음수 인지
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		
		// 중첩 IF : if문 안의 if
		if(num==0) {
			System.out.println("0입니다.");
		}else {		// 양의 정수이거나 음의 정수
			if(num>0) {
				System.out.println("양수입니다.");
			}else {
				System.out.println("음수입니다.");
			}
		}
		scanner.close();
	}

}
