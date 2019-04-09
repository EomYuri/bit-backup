package com.example.javaex.oper;

// 비트 시프트 연산자
public class BitShiftOperEx {

	public static void main(String[] args) {
		int val = 1;
		
		System.out.println("Original: "+Integer.toBinaryString(val));
		System.out.println("val<<1: "+Integer.toBinaryString(val<<1));
		System.out.println("Final: "+Integer.toBinaryString(val<<4));
		
		
	}

}
