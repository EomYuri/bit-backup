package day1;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = scanner.nextInt();
		for(int i=1; i<=num;i++) {
			for(int j =1; j<=num; j--) {
//			for(int j =i; j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
