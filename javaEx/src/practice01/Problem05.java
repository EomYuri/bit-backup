package practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int max=0;
		
		for(int i = 1;i<=5;i++) {
			System.out.println("숫자: ");
			int num = scanner.nextInt();
			
			if (num>max) {
				max=num;
			}
		}
		System.out.printf("최대값은 %d입니다.%n", max);
		scanner.close();
		
	}

}
