package com.example.oop.goods.v3;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println("divided 호출: "+divide(10,5));
		System.out.println("배열 이용한 인수 전달: "+sum(new double[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println("가변 인수 전달: "+sumVar(1,2,3,4,5,6,7,8,9,10));
		printTotal("고정+가변 인수 전달: ",1,2,3,4,5,6,7,8,9,10);
	}
	
	// 넘겨받을 인수 개수가 정해져 있지 않을 때 : 배열을 이용한 전달
	public static double sum(double[]values) {
		double total = 0;
		for (double num:values) {
			total += num;
		}
		return total;
	}
	
	// 넘겨받을 인수 개수가 정해져 있지 않을 때 : 가변인수 활용
	public static double sumVar(double ... values) {
		/*
		 * double total = 0; for(double num:values) { total += num; } return total;
		 */
		return sum(values);
	}
	
	// 고정 인수와 가변 인수를 동시에 사용할 때 
	// 순서에 유의 : 고정 인수 선언 -> 가변 인수
	public static void printTotal(String message,   // 고정
			double ... values) {    // 가변
		System.out.println(message+sumVar(values));
	}
	// 메서드 작성의 기본 형태
	public static double divide(double num1, double num2) {
		// 로딕
		return num1/num2;
		
	}

}
