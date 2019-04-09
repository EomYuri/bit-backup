package com.example.javaex.loop;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dan = 0;
		
		System.out.print("단을 입력하세요: ");
		dan = scanner.nextInt();
		
		for (int i = 1; i <= 9 ; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		scanner.close();
		
	}

}
