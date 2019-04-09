package com.example.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// 기본 : 만들기
		Integer i = new Integer(10);
		Character c = new Character('c');
		// JDK 9에서 Deprecated 되었습니다.
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		// 문자열로 넘겨 주셔도 됩니다.
		Integer i2 = Integer.valueOf(10);
		Float f2 = Float.valueOf(3.14159f);
		// 주의 : 문자열이 해당 데이터 타입에 담길 수 있는 형태의 문자열이어야 합니다.
		
		// parse 계열 메서드 : 문자열데이터 타입 변한 혹은 그 역
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("FF", 16)); // 진법 변환
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toHexString(128));
		
		// 형변환
		System.out.println(i2.doubleValue());
		System.out.println(f2.intValue());
		
		// 포장된 값의 비교
		Integer i3 = Integer.valueOf(2019);
		Integer i4 = Integer.valueOf(2019);
		
		System.out.println("i3 == i4?" + (i3 == i4));
		
		// 언박싱 비교
		System.out.println("언박싱 비교: " + (i3.intValue() == i4.intValue()));
		// equals 비교
		System.out.println("equals 비교: " + i3.equals(i4));

	}

}
