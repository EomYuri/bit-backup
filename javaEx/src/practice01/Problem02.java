package practice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j<= i;j++) {
				System.out.print(i);
			}
			System.out.println();
			scanner.close();
		}
		
	}

}
