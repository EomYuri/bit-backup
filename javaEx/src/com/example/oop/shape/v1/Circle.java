package com.example.oop.shape.v1;

public class Circle extends Shape {

	// 추가 필드
	protected int radius;

	public Circle(int x, int y) {
		super(x, y);
	}
	// 추가 생성자
	public Circle(int x, int y, int radius) {
		this(x,y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%d, area=%f]을 그렸습니다.%n", x, y, radius, area());
	}


	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);

	}
}
