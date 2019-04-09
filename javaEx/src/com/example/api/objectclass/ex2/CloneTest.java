package com.example.api.objectclass.ex2;

public class CloneTest {

	public static void main(String[] args) {
//		shallowCopy();
		deepCopy();

	}
	
	private static void deepCopy() {
		Scoreboard s1 = new Scoreboard(
				new int[] {10,20,30,40});
		System.out.println("s1: " + s1);
		
		// 복제 시도
		Scoreboard s2 = s1.getClone();
		System.out.println("s2: " + s2);
		
		s2.getScores()[1] = 0;
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		// 내부에 참조 타입을 필드로 갖고 있는 객체는 내부 참조 객체도 함께 복사
		
	}
	private static void shallowCopy() {
		Point p = new Point(10, 20);
		System.out.println("p: " + p);
		
		// p를 복제
		Point p2 = p.getClone();
		System.out.println("p2: "+p2);
		
		// p와 p2의 hashcode 비교
		System.out.println(p == p2);
		// p와 p2의 내부값 비교
		System.out.println(p.equals(p2));
	}

}
