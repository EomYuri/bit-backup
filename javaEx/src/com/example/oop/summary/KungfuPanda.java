package com.example.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill {

	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	@Override
	public void Kungfu() {
		System.out.println("아뵤~~!");
	}
	
	

}
