package com.example.javaex.var;

// 정수 타입에 대해서 샘플
public class IntLongEx {

	public static void main(String[] args) {
		// int 변수 - Java의 기본 정수 처리 형식
		int intVar1;
		int intVar2;
		
		intVar1 = 2019;
//		intVar2 = 12345674890123; // 범위 초과 데이터 저장 불가
		
		// long 타입
		long longVar1;
		long longVar2;
		
		longVar1 = 2019;
		longVar2 = 1234567890123L; // 뒤에 L
		
		// 2진수, 8진수, 16진수 데이터 할당
		int bin, oct, hex;
		
		bin = 0b1010; // 2진수 데이터
		oct = 072;    // 8진수 데이터
		hex = 0xFF;   // 16진수 데이터
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
