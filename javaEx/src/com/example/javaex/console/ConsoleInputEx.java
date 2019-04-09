package com.example.javaex.console;

// 콘솔 입력 예제 : Scanner 사용
import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
		// Scanner 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요:");
		String name = scanner.next();
		System.out.println("이름:"+name);
		// 인풋 데이터의 포맷에 맞게 메서드 선정
		// TODO: 예외 처리 필요
		System.out.print("나이를 입력해 주세요:");
		int age = scanner.nextInt();
		System.out.println("나이:"+age);
		System.out.println("당신의 이름은 "+name+", 나이는 "+age+"입니다.");
		
		scanner.close(); // 사용 후 닫아주자!!
	}

}
