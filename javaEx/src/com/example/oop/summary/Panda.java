package com.example.oop.summary;

public class Panda extends Animal {

	// 생성자 생성
	public Panda(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void say() {   // 부모의 추상 메서드는 반드시 구현
		System.out.println("판다.");
		
	}

}
