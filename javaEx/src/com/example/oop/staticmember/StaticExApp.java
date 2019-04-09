package com.example.oop.staticmember;

class StaticEx{
	// 필드
	public static int refCount; //클래스 변수
	public static String classVar; //클래스 변수
	public String instanceVar; //인스턴스변수
	//static 블록을 이용한 클래스 변수의 초기화
	// static 블록을 이용한 클래스 변수의 초기화
	static {
		refCount = 0;
		classVar = "클래스 변수";
		System.out.println("static 블록 호출");
	}
	// 생성자
	public StaticEx() {
		refCount++; // 인스턴스 -> 클래스 변수 접근
		instanceVar = "인스턴스 변수"; 
		System.out.println("생성자 호출");
	}

	//	@Override
	protected void finalize() {
		//객체 소멸될 때 
		System.out.println("소멸자 호출");
		refCount--;
	}
}


public class StaticExApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		System.out.println("Refcount: "+StaticEx.refCount);
		StaticEx s2 = new StaticEx();
		System.out.println("Refcount: "+StaticEx.refCount);

		s1 = null;
		System.gc();
		try {
			Thread.sleep(3000);
			System.out.println(StaticEx.refCount);
		}catch(Exception e) {
		}
	}

}
