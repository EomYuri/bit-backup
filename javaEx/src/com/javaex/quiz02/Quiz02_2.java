package com.javaex.quiz02;

public class Quiz02_2 {

	public static void main(String[] args) {
		int balls = 136;
		int cap = 10;
		
		/*
		 * int box= balls/cap;
		 * 
		 * // balls/cap이 14보다 크면 15개 // 13보다 작으면 박스 13개 // 그 사이값이면 14개 String message;
		 * 
		 * message = box > 14? "15개": box < 13 ? "13개" : "14개";
		 * System.out.println(message);
		 */
		
		
		int cnt = balls/ cap;
		
		cnt += (balls % cap) > 0 ? 1 : 0;
		System.out.println(cnt);
		
	}

}