package com.example.oop.summary;

public abstract class Animal {   // 추상 클래스

	   // 필드
	   protected String name;
	   protected int age;
	   
	   // 생성자
	   public Animal (String name, int age) {
	      this.name=name;
	      this.age= age;
	   }

	   public abstract void say(); // 구현부 없음
	   
	   public void eat() {
	      System.out.println(name + "이 먹고 있다.");
	   }
	   
	   public Animal() {
	      
	   }
	   
	}