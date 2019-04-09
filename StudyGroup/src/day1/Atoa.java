package day1;
//https://doqtqu.tistory.com/9?category=799165
import java.util.Scanner;

public class Atoa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("영문자를 입력하세요.");
		char alpha = scanner.next().charAt(0);
		
		if( alpha >= 'A'&& alpha<='Z') {
			System.out.println((char)(alpha+32));
		}else if( alpha >='a'&& alpha <='z') {
			System.out.println((char)(alpha-32));
		}else {
			System.out.println("영문자가 아닙니다.");
		}

	}

}
