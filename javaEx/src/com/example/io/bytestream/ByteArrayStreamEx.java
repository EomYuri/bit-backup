package com.example.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 인풋 소스
		byte[] src = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		// 아웃풋 타겟
		byte[] target = null;
		System.out.println(Arrays.toString(src));

		// 스트림 열기
		try{ InputStream bis = new ByteArrayInputStream(src);
		OutputStream bos = new ByteArrayOutputStream();

		// 인풋 스트림으로부터 데이터를 받아들일 변수
		int data;
		while((data = bis.read()) != -1){
			System.out.println("READ DAYA: " + data);

			bos.write(data);
		}
		target = ((ByteArrayOutputStream)bos).toByteArray();
		System.out.println("Target: "+Arrays.toString(target) );
		bos.close();
		bis.close();
		}catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());

		}

	}
}
