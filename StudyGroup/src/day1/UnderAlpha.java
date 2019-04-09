package day1;
//���� �� �ȵ�
import java.util.Scanner;

public class UnderAlpha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요.");
		char alpha = scanner.next().charAt(0);
		int x = alpha - 'a'-1;
		for(int i = 0; i<x; i++) {
			int k = 0;
			for (int j = x-i; j>0; j--) {
				System.out.print((char)('a'+k));
				k++;
			}
			System.out.println();
		}
		
		

	}

}
