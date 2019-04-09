package phoneproject;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {
	private static String original = "D:\\javaStudy\\files\\phonenum.txt";

	public static void RegisterMem() {

		try {

			Writer writer = new FileWriter(original,true);
			BufferedWriter bw = new BufferedWriter(writer);
			PrintWriter pw = new PrintWriter(bw, true);



			Scanner sc = new Scanner(System.in);
			ArrayList<Address> lst  = new ArrayList<>();

//			System.out.println();
			System.out.print(">이름: ");
			String name = sc.nextLine();
			System.out.print(">휴대전화: ");
			String hp = sc.nextLine();
			System.out.print(">집전화: ");
			String company = sc.nextLine();
//			Address member = new Address(name, hp, company);
//			lst.add(member);
//			System.out.println(name+","+hp+","+company+"\n");
			pw.write("\r\n"+name+","+hp+","+company);
			System.out.println();
			System.out.println("[등록되었습니다.]");
			
			pw.flush();
			pw.close();



		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e2) {
			System.out.println(e2.getMessage());
		}

	}
}
