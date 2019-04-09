package day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Threetest {
// ���� �ȵ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 10���� �Է��ϼ���.");
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0;i<=10;i++) {
			array.add(sc.nextInt());
		}
		for(int i=0;i<=array.size();i++) {
			if(array.get(i)%3==0) {
				System.out.println(array.get(i)+" ");
			}
		}
	}

}

