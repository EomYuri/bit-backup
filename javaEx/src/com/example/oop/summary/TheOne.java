package com.example.oop.summary;

public class TheOne extends Human implements KungfuSkill, Flyable{
	// 여러 인터페이스 구현

	public TheOne(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {  // Flyable 인터페이스
		System.out.println("I believe I can fly!");
		
	}

	@Override
	public void Kungfu() {  // KungfuSkill
		System.out.println("I know Kungfu!");
		
	}

}
