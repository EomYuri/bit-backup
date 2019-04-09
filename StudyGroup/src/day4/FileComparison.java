package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileInputStream fr1 = null;
		FileInputStream fr2 = null;
		int same = 0;
		int a, b;
		try {
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			fr1 = new FileInputStream("C:\\Users\\bit\\Desktop\\엄유리\\자바\\그룹스터디\\day4\\"+sc.next()+".txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.print("두번째 파일 이름을 입력하세요>>");
			fr2 = new FileInputStream("C:\\Users\\bit\\Desktop\\엄유리\\자바\\그룹스터디\\day4\\"+sc.next()+".txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (fr1.available() != fr2.available()) {
				same = 0; 	// 같지않다
			}else {
				same = 1;
				while((a = fr1.read()) != -1) { // a가 파일의 끝을 만날때까지
					b = fr2.read();	// b를 읽어들임
					if(a != b) {
						same = 0; // 같지 않다.
						break;
					}
						
				}
			}
			if(same == 1) {
				System.out.println("파일이 같습니다.");
			}else {
				System.out.println("파일이 다릅니다.");
			}
			fr1.close(); fr2.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
