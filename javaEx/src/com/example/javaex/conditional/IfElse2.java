package com.example.javaex.conditional;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Java, 2. C, 3. C++, 4. Python");
		int num = scanner.nextInt();
		String roomName = "";
		
		if(num == 1) {
			roomName = "R101";
		}else if(num == 2 ){
			roomName = "R202";
		}else if(num == 3) {
			roomName = "R303";
		}else if(num == 4) {
			roomName = "R404";
		}else {
			roomName = "관리자에게 문의하세요.";
		}
		System.out.println(roomName);
		scanner.close();

	}

}
