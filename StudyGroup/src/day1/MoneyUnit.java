package day1;

import java.util.Scanner;

public class MoneyUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		for(int i = 0;i<8;i++) {
			System.out.print(unit[i]+"원: "+(money/unit[i]+" "));
			money%=unit[i];
		}

	}

}