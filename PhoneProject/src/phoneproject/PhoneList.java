package phoneproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneList {//PhoneNum.save();
	
//	private static String original = "D:\\javaStudy\\files\\phonenum.txt";

	public  static void save() {
		File file = new File("D:\\javaStudy\\files\\phonenum.txt");
		
		List<Address> address = new ArrayList<Address>();

		try {
			Reader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

			String line = null;

			while((line = reader.readLine()) != null) {
				String[] splited = line.split(",");
				address.add(new Address(splited[0],splited[1],splited[2]));
			}
			br.close();

		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e2) {
			System.out.println(e2.getMessage());
		}
		Address[] iArray = address.toArray(new Address[address.size()]);

		for(int i = 0; i<iArray.length;i++) {
	         System.out.println((i+1)+". "+ iArray[i].getName()+"   "+iArray[i].getHp()+"   "+iArray[i].getCompany());
	      }
	      System.out.println();

		
	}
}
