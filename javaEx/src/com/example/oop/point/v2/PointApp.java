package com.example.oop.point.v2;

class Point{
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메서드
	public void draw() {
		System.out.printf("점 [x=%d, y=%d]를 그렸습니다.%n", x,y);
	}
	
	public void draw(boolean show) {
		// show -> true => 그렸습니다.
		// show -> false => 지웠습니다.
		String message = String.format("점 [x=%d, y=%d]를 그렸습니다.%n", x,y);
		message += show ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}

}
public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
//		p1.setX(10);
//		p1.setY(20);
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
		Point p2 = new Point(30,40);
//		p2.setX(30);
//		p2.setY(40);
		p2.draw();
		p2.draw(true);
		p2.draw(false);

		
	}

}
