package com.example.oop.casting;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	// 추가 기능
	public void meow() {

		System.out.println(name+" :야옹");
	}
}

