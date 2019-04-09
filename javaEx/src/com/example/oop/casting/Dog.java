package com.example.oop.casting;

public class Dog extends Animal {
	
	//생성자
	public Dog(String name) {
		super(name);
	}
	// 추가 메서드의 구현
	public void bark() {
		System.out.println(name+": 멍멍");
	}

}
