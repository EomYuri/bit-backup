package com.example.oop.summary;

public class Human extends Animal {

	public Human(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void say() {
		System.out.println("내 이름은 " + name + "입니다.");
		
	}

}
