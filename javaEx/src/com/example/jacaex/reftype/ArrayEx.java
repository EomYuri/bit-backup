package com.example.jacaex.reftype;

// Array 예제
public class ArrayEx {

	public static void main(String[] args) {
		// 배열 선언
		String[] names;
		int scores[]; // [] 위치 상관 없음
		
		// 초기화
		names = new String[] {"김", "이", "박", "정"};
		
		// 초기값이 이미 있다면
		float height[] = {175.0f, 168.0f, 160.5f, 180.2f};   // 선언과 동시에 할 때만 효과
		System.out.println(height[2]);
		scores = new int[4];    // size 4의 빈공간
		
		// 인덱스 접근 [인덱스번호]
		// 0부터 시작 ~ 배열의 length - 1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 75;
		scores[3] = 95;
		// 인덱스 범위를 벗어나면 오류
		System.out.printf("length: %d%n",scores.length);

		for(int i = 0; i <= scores.length-1 ; i++) {
			System.out.printf("%s (%.2f): score = %d%n", names[i],height[i],scores[i]);
		}
	}

}
