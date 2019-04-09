package com.example.io;

import java.io.File;
import java.io.IOException;

// File 클래스 연습
public class FileClassEx {
//	private static String dirName = "D:\\javastudy\\files\\";
	private static String dirName = "D:\\javastudy\\";

	public static void main(String[] args) {
		// 파일 객체 생성
		File root = new File(dirName);
		// 디렉터리가 존재하는지 확인
		System.out.println(dirName + ":" + root.exists());
		
		
		// 디렉터리가 없으면 만들어 줍시다.
		if(!root.exists()) {
			root.mkdirs();
		}
		System.out.println(dirName + "exists? :" + root.exists());
		// 파일 정보를 출력
		printFileInfo(root);
		
		// 파일 만들어 봅시다
		File file = new File(dirName + "address.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch(IOException e) {
				System.out.println("파일 생성 오류");
			}
		}
		printFileInfo(root);
		
//		// 파일을 지워 봅시다
		file.delete();
		printFileInfo(root);

	}
	
	private static void printFileInfo(File f) {
		System.out.println("-----------");
		
		// 이 파일이 디렉터리인지 확인
		if(f.isDirectory()) {
			// 디렉터리와 내부 파일목록 출력
			System.out.println("Directory: "+f.getName());
			// 내부의 파일 목록
			File[] files = f.listFiles();
			// 파일 목록 출력
			for( File file:files) {
				System.out.print("\t" + (file.isDirectory() ? "d":"f"));
				System.out.println("\t" + file.getName());
			}
			
		}else {
			// 파일 정보를 출력
			System.out.println("\tf\t"+f.getName());
		}
	}

}
