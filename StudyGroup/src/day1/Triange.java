package day1;

import java.util.Scanner;

public class Triange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���>>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		if((num1+num2)<num3||(num1+num3)<num2||(num2+num3)<num1) {
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");
		}else {
			System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		}

	}

}
