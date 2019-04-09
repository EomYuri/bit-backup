package day1;

import java.util.Scanner;

public class MoneyBack {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �׼��� �Է��ϼ���.");
		int money = scanner.nextInt();
	
		int m1 = (int)(money/50000);
		int m2 = (money%50000)/10000;
		int m3 = (money%10000)/5000;
		int m4 = (money%5000)/1000;
		int m5 = (money%1000)/500;
		int m6 = (money%500)/100;
		int m7 = (money%100)/50;
		int m8 = (money%50)/10;
		System.out.println("5����: "+m1+"��, ����: "+m2
				+"��, 5õ��: "+m3+"��, õ��: "+m4
				+"��, 5���: "+m5+"��, ���: "+m6
				+"��, 5�ʿ�: "+m7+"��, �ʿ�: "+m8);
	}

}
