package com.example.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	private static String dirName = "D:\\javastudy\\files\\";
	private static String original = dirName + "last-leaf.txt";
	private static String target = dirName + "last-leaf-filtered.txt";

	public static void main(String[] args) {
		// last-leaf.txt. 안쪽 문장 중에서 leaf, leaves가 있는 문장만 필터링 저장
		try {
			// 메인스트림
			Reader fr = new FileReader(original);
			Writer fw = new FileWriter(target);

			// 보조 스트림
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			String line = "";

			while((line = br.readLine()) != null) {
				if(line.toLowerCase().contains("leaf") ||
						line.toLowerCase().contains("leaves")){
					System.out.println(line);
					bw.write(line);
					bw.write("\r\n");
				}

			}
			br.close();
			bw.close();

			System.out.println("필터링 완료");

		} catch(FileNotFoundException e) {
			System.out.println("파일 없음" + e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException: "+e.getMessage());



		}

	}
}
