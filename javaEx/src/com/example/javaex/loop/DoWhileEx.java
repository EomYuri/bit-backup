package com.example.javaex.loop;

import java.util.Scanner;

// do while 예제
public class DoWhileEx {

	public static void main(String[] args) {
		int total = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		// 숫자를 입력받아 합산, 0이면 종료
		do { // 최소 1번은 실행, 조건검사를 뒤에서
			System.out.println("숫자를 입력하세요: ");
			num = scanner.nextInt();
			total += num;
		}while (num !=0);
		System.out.println("합산값: "+total);
		scanner.close();

	}

}
