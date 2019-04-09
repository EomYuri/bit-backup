package com.example.oop.casting;

// 캐스팅 연습
public class CastingEx {

	public static void main(String[] args) {
		Animal dog1 = new Dog("스누피"); // Upcasting
		dog1.eat();
		dog1.walk();
//		dog1.bark();      // 못해요

		Animal cat1 = new Cat("가필드");
		cat1.eat();
		cat1.walk();
//		cat1.meow();      // 못해요
		
		// 다운캐스팅 -> 명시적으로 캐스팅
		((Dog)dog1).bark();
//		((Cat)dog1).meow();  //Error
		if(cat1 instanceof Dog) {
			((Dog)cat1).bark();
		}else if(cat1 instanceof Cat) {
			((Cat)cat1).meow();
		}
		
		// 애완동물
//		Dog pet = new Dog("마루"); 
		Animal pet = new Dog("마루");
		pet.eat();
		pet.walk();
		
//		pet.bark();
		
		pet  = new Cat("망고");
	}

}
