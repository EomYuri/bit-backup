package com.example.oop.shape.v1;

public class Rectangle extends Shape {
	// 추가 필드
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y) {
		super(x,y);
	}
	
	public Rectangle(int x, int y, int width, int height) {
		this(x,y);
		this.width = width;
		this.height = height;
	}

	
	// Override
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸습니다.%n", x, y, width, height, area());
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	

}
