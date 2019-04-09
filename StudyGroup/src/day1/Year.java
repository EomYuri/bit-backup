package day1;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���.");
		int year = scanner.nextInt();
		if(year%4==0) {
			System.out.println("����");
		}else if((year%4==0)&&(year%100==0)) {
			System.out.println("���");
		}else if((year%4==0)&&(year%100==0)&&(year%400==0)) {
			System.out.println("����");
		}else {
			System.out.println(year);
		}
		

	}

}
