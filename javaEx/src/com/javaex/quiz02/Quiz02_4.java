package com.javaex.quiz02;

public class Quiz02_4 {

	public static void main(String[] args) {
		char ch = 'A';
		/* 65<=ch && ch<=90 */
		if(ch==65){
			ch=(char)(ch+32);
		}
		
		System.out.println(ch);

	}
}