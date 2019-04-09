package com.example.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	private static String dirName = "D:\\javastudy\\files\\";
	private static String filename = dirName + "primitives.txt";

	public static void main(String[] args) {
		// 스트림을 열어서 기본 타입을 저장
		try {OutputStream fos = new FileOutputStream(filename);
		// 기본 타입 출력을 위해 DataOutputStream을 연결
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("엄유리");
		dos.writeBoolean(true);
		dos.writeInt(24);
		dos.writeFloat(80.9f);
		
		dos.writeUTF("안지선");
		dos.writeBoolean(false);
		dos.writeInt(25);
		dos.writeFloat(99.9f);
		
		dos.flush();
		dos.close();
		
			System.out.println("저장완료");
			
			// 불러옵시다
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			
			for(int i = 0; i<2; i++) {
				// 주의 : 출력한 순서대로 불러와야 한다.
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s, %b, %d, %f%n", s, b, val, f);
			}
			
			dis.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다."+e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}

	}

}
