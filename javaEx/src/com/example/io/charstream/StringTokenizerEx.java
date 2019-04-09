package com.example.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	private static String dirName = "D:\\javastudy\\files\\";
	private static String filename = dirName + "thieves.txt";

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader(filename);
			BufferedReader br = new BufferedReader(reader);

			String thief;

			while((thief = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thief, " ");
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.println("TOKEN: "+token);
				}
			}
			
			br.close();
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}

	}

}
