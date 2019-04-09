package com.javaex.practice.extra01.q02;

public class Question02 {
	public int getAnswer(int toNum) {
		int num = toNum;
		
		while(true) {
			boolean pass = true;
			
			for(int i = 2; i<= toNum; i++) {
				if(num % i != 0) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				break;
			}
			num++;
		}
		
		return num;
	}
}
