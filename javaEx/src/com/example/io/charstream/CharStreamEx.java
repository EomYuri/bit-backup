package com.example.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	private static String dirName = "D:\\javastudy\\files\\";
	private static String filename = dirName + "char.txt";
	
	public static void main(String[] args) {
		// FileWriter을 열어서 텍스트를 저장
		try {
			Writer fwriter = new FileWriter(filename);
			fwriter.write("Java Programming\r\n");
			fwriter.write("Bit Computer\r\n");
			fwriter.write("2019.01");
			fwriter.close();
			
			System.out.println("텍스트 파일 생성");
			
			Reader freader = new FileReader(filename);
			int data = 0;
			
			while ((data = freader.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			freader.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.out.println("IOException:" + e.getMessage());
			
			
		}

	}

}
