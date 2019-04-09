package com.example.jacaex.reftype;

// 2차원 배열
public class ArrayEx2 {

	public static void main(String[] args) {
		// 2차원 배열의 선언
		int [][] twoDimen = new int[5][10];
		System.out.println("towDimen.length: "+twoDimen.length);
		// 초기 데이터가 있을 경우
		int table[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		// Java의 다차원 배열은 배열의 배열
		System.out.println("table.length: "+table.length);
		System.out.println("table[0].length: "+table[0].length);
		
		// table 이차원 배열의 모든 값을 합산해 봅시다
		int total = 0;
		
		for (int row = 0; row < table.length; row++) {
			for(int col = 0; col < table[row].length; col++) {
				total += table[row][col];
				System.out.print(table[row][col]+"\t");
			}
			System.out.println();
		}
		System.out.println("Total: "+total);

	}

}
