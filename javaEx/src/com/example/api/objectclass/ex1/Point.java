package com.example.api.objectclass.ex1;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("Point(%d, %d)", x, y);
	}
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point other = (Point)obj;
			return x == other.x &&y == other.y;
		}
		return super.equals(obj);
	}
}
	
