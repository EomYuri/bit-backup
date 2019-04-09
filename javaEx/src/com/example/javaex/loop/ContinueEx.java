package com.example.javaex.loop;

public class ContinueEx {

	public static void main(String[] args) {
		// 1에서 20까지의 수
		// 2의 배수와 3의 배수는 출력하지 않고 나머지 수 출력
		for( int i = 1; i<=20; i++) {
			if(i%2==0||i%3==0) {
				continue; // 다음 문장 실행핞고 다음 루프
			}
			System.out.println(i);
		}

	}

}
