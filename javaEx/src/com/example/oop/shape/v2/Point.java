package com.example.oop.shape.v2;

public class Point implements Drawable {
	// 필드
	protected int x;
	protected int y;

//	public Point() {
//		// TODO Auto-generated constructor stub
//	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]를 그렸습니다.%n",x,y);
	}
}
