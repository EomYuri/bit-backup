package practice02;

import java.util.Scanner;


public class Problem02 {

	public static void main(String[] args) {
		double num [] = new double[5];
		double total=0;
		Scanner scanner = new Scanner(System.in);

		
		for(int i = 0; i<num.length;i++) {
			num[i] = scanner.nextInt();
			total += num[i];

		}
		
		double average = total/num.length;
		System.out.println("평균은"+average+"입니다.");
		
	}

}
