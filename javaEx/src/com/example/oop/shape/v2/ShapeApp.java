package com.example.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(10,20);   // 안됩니다
		
		Rectangle r = new Rectangle(10,20,100,50);
		r.draw();
		
		Circle c = new Circle(10,10,30);
		c.draw();
		
		// 인터페이스는 그 자체로 참조타입으로 사용할 수 있다.
		Drawable obj;
		obj = r;
		r.draw();
		obj = c;
		c.draw();
		
		Point p = new Point(10,10);
		obj = p;
		p.draw();

	}

}
