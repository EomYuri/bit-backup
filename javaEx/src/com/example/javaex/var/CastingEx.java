package com.example.javaex.var;

public class CastingEx {

	public static void main(String[] args) {
		// 암묵적 형변환
		// 표현 범위가 작은 데이터 타입 -> 큰 데이터 타입
		byte b = 25; // 1바이트 정수
		System.out.println(b);
		
		short s = b; // 2바이트 정수
		System.out.println(s);
		
		int i = s; // 4바이트 정수
		System.out.println(i);
		
		long l = i; // 8바이트 정수
		System.out.println(l);
		
		float f = l; // 4바이트 실수
		System.out.println(f);

		double d = f;
		System.out.println(d);
		
		
		// 표현 범위가 넓은 쪽에서 좁은쪽으로 할당
		// 강제로 변환 : 명시적 캐스팅
		byte b2;
		int i2 =2019;
		float f2 = 3.14159f;
		
		b2 = (byte)i2;
		System.out.println("int: " + i2 + "-> byte: "+b2);
		
		
		i2 = (int)f2;
		System.out.println("float: " + f2 + "-> int: "+i2);
		
		//명시적 형 변환시에는 데이터의 유실에 주의
	}

}
