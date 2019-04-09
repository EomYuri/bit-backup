package com.example.javaex.loop;

public class BreakEx {

	public static void main(String[] args) {
		// 양의 정수 중에서
		// 6의 배수이고 14의 배수인 가장 작은 정수
		
		int num = 1;
		
		while(true) {  // 일단 무한 루프
			if(num%6==0&&num%14==0) {
				break;   // 루프 탈출
			}
			num++;
		}
		System.out.println(num);
		
	}

}
