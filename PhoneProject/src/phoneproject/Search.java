package phoneproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

	private static String original = "D:\\javaStudy\\files\\phonenum.txt";

	public static void search() {
		File file = new File("D:\\javaStudy\\files\\phonenum.txt");

		List<Address> address = new ArrayList<Address>();

		Scanner scanner = new Scanner(System.in);
		System.out.println(">이름: ");
		String find = scanner.nextLine();

		try {
			Reader fr = new FileReader(original);
			BufferedReader br = new BufferedReader(fr);
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

			String line = null;

			int num=0;
			while((line = reader.readLine()) != null) {
				String[] splited = line.split(",");
				address.add(new Address(splited[0],splited[1],splited[2]));

				if(line.contains(find)){
					System.out.println((num+1)+". "+ address.get(num).getName()+"   "+address.get(num).getHp()+"   "+address.get(num).getCompany());
				}
				num++;
			}
			br.close();

		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e2) {
			System.out.println(e2.getMessage());
		}



	}

}
