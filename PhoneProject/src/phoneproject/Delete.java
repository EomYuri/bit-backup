package phoneproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delete {
	private static String original = "D:\\javaStudy\\files\\phonenum.txt";
	public static void del() {
		
		File file = new File("D:\\javaStudy\\files\\phonenum.txt");
		
		List<Address> address = new ArrayList<Address>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">번호 : ");
		int num = scanner.nextInt();

		try {
			Reader fr = new FileReader(original);
			BufferedReader br = new BufferedReader(fr);
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

			String line = null;

			while((line = reader.readLine()) != null) {
				String[] splited = line.split(",");
				address.add(new Address(splited[0],splited[1],splited[2]));
			}
			br.close();
			
			Writer fw = new FileWriter(original);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i<address.size();i++) {
				if(i!=(num-1)) {
					bw.write(address.get(i).getName());
					bw.write(",");
					bw.write(address.get(i).getHp());
					bw.write(",");
					bw.write(address.get(i).getCompany());
					bw.write("\r\n");
				}	
			}
			bw.flush();
			bw.close();

		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e2) {
			System.out.println(e2.getMessage());
		}
//		Address[] iArray = address.toArray(new Address[address.size()]);
//
//		for(int i = 0; i<iArray.length;i++) {
//	         System.out.println((i+1)+". "+ iArray[i].getName()+"   "+iArray[i].getHp()+"   "+iArray[i].getCompany());
//	      }
//	      System.out.println();

		
//	}
	}
}
