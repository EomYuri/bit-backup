package day1;

import java.util.Scanner;

public class GCD {
// �ִ����� ���ϱ� ���ؾȵ� �̤�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° �� �Է�>>");
		int a = scanner.nextInt();
		System.out.println("�� ��° �� �Է�>>");
		int b = scanner.nextInt();
		
		int r;
		if(a<b) {
			r=a;
			a=b;
			b=r;
		}
		r=a%b;
		while(r>0) {
			a=b;
			b=r;
			r=a%b;
		}
		System.out.println("�ִ�����: "+b);

	}

}
