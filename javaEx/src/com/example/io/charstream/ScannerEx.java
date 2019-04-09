//package com.example.io.charstream;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.Reader;
//import java.util.Scanner;
//
//public class ScannerEx {
//	private static String dirName = "D:\\javastudy\\files\\";
//	private static String filename = dirName + "phonenum.txt";
//
//	public static void main(String[] args) {
//		File file = new File(filename);
//		
//		try {
//			Scanner scanner = new Scanner(file);
//			String name;
//			String hp;
//			String company;
//			
//			String[] splitedStr = null;
//			String line = null;
//			splitedStr = null;
//			
//			while((line = reader.readLine()))
//			
//			
//			
//			// 받아올 내용 있는지 확인
////			while(scanner.hasNextLine()) {
////				name = scanner.next();
////				hp = scanner.next();
////				company = scanner.next();
//				
//				System.out.printf("%s, %s, %s%n", name, hp, company);
//				scanner.nextLine();
//				
//			}
//			scanner.close();
//		}catch(FileNotFoundException e) {
//			System.out.println("파일 못찾음: "+e.getMessage());
//		}catch(IOException e) {
//			System.out.println("IOException: "+e.getMessage());
//		}
//
//	}
//
//}
