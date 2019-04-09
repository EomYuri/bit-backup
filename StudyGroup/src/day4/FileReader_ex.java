package day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader fr1 = null;
		FileReader fr2 = null;
		FileWriter fr3 = null;
		try {
			int i;
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			fr1 = new FileReader("C:\\Users\\bit\\Desktop\\엄유리\\자바\\그룹스터디\\day4\\"+sc.next()+".txt");
			System.out.print("두번째 파일 이름을 입력하세요>>");
			fr2 = new FileReader("C:\\Users\\bit\\Desktop\\엄유리\\자바\\그룹스터디\\day4\\"+sc.next()+".txt");
			fr3 = new FileWriter("C:\\Users\\bit\\Desktop\\엄유리\\자바\\그룹스터디\\day4\\fr3.txt");
			while((i = fr1.read()) != -1) {
				fr3.write(i);
			}
			while((i = fr2.read()) != -1) {
				fr3.write(i);
			}
			System.out.println("새로운 파일을 생성하였습니다.");
			fr1.close(); fr2.close(); fr3.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
