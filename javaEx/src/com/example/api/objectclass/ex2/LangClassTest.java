package com.example.api.objectclass.ex2;

public class LangClassTest {
	public static void main(String[] args) {
//		objectBasic();
		equalsEx();
	}
	//equals 오버라이드
	private static void equalsEx() {
		Point p = new Point (10,10);
		Point p2 = new Point (10,10);
		
		System.out.println(p == p2);  // 두 객체의 hashcode() 비교
		System.out.println(p.equals(p2));  // 오버라이드 필요
	}
	//Object의 기본 내용과 toString
	private static void objectBasic() {
		Point p = new Point(10, 10);
		// Java 최상위 클래스는 Object
		//		Object의 모든 멤버는 다른 모든 클래스에서 사용
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());    // 객체 실별자
		System.out.println(p);
		System.out.println(p.toString());    // 문자열로 

		// p의 부모 객체를 얻어와보자
		System.out.println(p.getClass().getSuperclass().getName());

	}


}
