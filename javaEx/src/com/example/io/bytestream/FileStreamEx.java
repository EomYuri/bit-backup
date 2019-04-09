package com.example.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {

		private static String dirName = "D:\\javastudy\\files\\";
		private static String original = dirName  + "img.jpg";
		private static String target = dirName + "img_copy.jpg";
		
		public static void main(String[] args) {
			try {
				InputStream bis = new FileInputStream(original);
				OutputStream bos = new FileOutputStream(target);
				
				int data = 0;
				while((data = bis.read()) != -1) {
					bos.write(data);
				}
				
				bos.close(); bis.close();
				System.out.println("파일을 복사했습니다.");
			}catch(FileNotFoundException e) {
				System.out.println("파일을 찾을 수 없습니다.");
			}catch(IOException e) {
		         System.out.println("복사 중 오류 발생.");
		}
		

	}

}
