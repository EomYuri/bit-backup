package com.example.javaex.oper;
// 비트 연산자
// 하드웨어 제어, 이미지 프로세싱
// 미세한 단위에 데이터 제어
public class BitOperEx {

	public static void main(String[] args) {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println("b1: "+Integer.toBinaryString(b1));
		System.out.println("b2: "+Integer.toBinaryString(b2));
		
		int result = b1&b2; // 비트 AND 연산
		System.out.println("b1&b2: "+Integer.toBinaryString(result));
		result = b1|b2;
		System.out.println("b1|b2: "+Integer.toBinaryString(result));

		

	}

}
