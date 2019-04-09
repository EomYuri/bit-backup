package com.example.oop.staticmember;

// static 예제
class Calculator{
	static final double PI= 3.14159; // 클래스 멤버
	//클래스 메서드
	public static double getSum(double ... nums) {
		double total = 0;

		for(double num:nums) {
			total += num;
		}	
		return total;

	}
}
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("파이값은 : "+Calculator.PI);
		double total = Calculator.getSum(1,2,3,4,5,6,7,8,9,10);
		System.out.println("Total: "+total);
	}

}
