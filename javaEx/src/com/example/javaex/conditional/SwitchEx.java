package com.example.javaex.conditional;

import java.util.Scanner;

// switch case 예제
public class SwitchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Java, 2. C, 3. C++, 4. Python");
		
		int num = scanner.nextInt();
		String roomName = "";
		
		switch (num) {
		case 1:
			roomName = "R101";
			break;    // 잊지말자 break!!!!!!!!!!
		case 2:
			roomName = "R202";
			break;    // 잊지말자 break!!!!!!!!!!
		case 3:
			roomName = "R303";
			break;    // 잊지말자 break!!!!!!!!!!
		case 4:
			roomName = "R404";
			break;    // 잊지말자 break!!!!!!!!!!
		default:
			roomName = "관리자에게 문의";
			
		}
		scanner.close();
		System.out.println(roomName);

	}

}
