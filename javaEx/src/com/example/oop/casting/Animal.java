package com.example.oop.casting;

public class Animal {
	// 필드
	protected String name;   // 자식클래스도 접근 할 수 있게 하기 위해서 protected!! public은 누구나 사용 할 수 있어서 NO!! private는 자식도 접근 불가해서 NO!!
	
	// 생성자
	public Animal(String name) {
		this.name= name;
	}
	
	// 메소드
	public void eat() {
		System.out.println(name + "이 먹고 있습니다.");
	}
	public void walk() {
		System.out.println(name +"이 걷고 있습니다.");
	}
}