package com.example.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	private static String dirName = "D:\\javastudy\\files\\";
	private static String original = dirName + "img.jpg";
	private static String target = dirName + "img_copy_buffered.jpg";

	public static void main(String[] args) {
		try {
			// 메인스트림
			InputStream bis = new FileInputStream(original);
			OutputStream bos = new FileOutputStream(target);
			// 보조 스트림 연결
			BufferedInputStream buffIs = new BufferedInputStream(bis);
			BufferedOutputStream buffOs = new BufferedOutputStream(bos);
			
			// 버퍼 선언
			byte[] data = new byte[1024];
			int size = 0;
			
			while((size = buffIs.read(data)) != -1) {
				System.out.println(size + "바이트를 복사했습니다.");
				buffOs.write(data);
			}
			
			// 스트림을 닫겠습니다. 보조 스트림을 닫으면 주 스트림도 닫힙니다.
			buffIs.close();
			buffOs.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("파일 없음");
		}catch(IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}

	}

}
