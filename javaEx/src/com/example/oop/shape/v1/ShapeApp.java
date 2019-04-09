package com.example.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(10,20);   // 안됩니다
		
		Rectangle r = new Rectangle(10,20,100,50);
		r.draw();
		
		Circle c = new Circle(10,10,30);
		c.draw();

	}

}
