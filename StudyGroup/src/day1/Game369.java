package day1;

import java.util.Scanner;

public class Game369 {
	public static int numOfThree(int i) {
		int count = 0;
		if((i/10)%3==0) 
			count++;
		if((i%10)%3==0)
			count++;
		return count;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		if(numOfThree(num)==2) {
			System.out.println("박수짝짝");
		}else if(numOfThree(num)==1) {
			System.out.println("박수짝");
		}else {
			System.out.println(num);
		}
		scanner.close();


	}

}


