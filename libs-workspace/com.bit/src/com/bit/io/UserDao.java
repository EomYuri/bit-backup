package com.bit.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDao {
	ArrayList<UserVo> list = new ArrayList<>();

	public void process() {
		save(); //파일을 외부에 쓴다. (직렬화)
		load(); // 외부 파일을 읽어들인다. (역직렬화)
	}
	private void save() {
		list.add(new UserVo("박신혜", 30, "서울"));
		list.add(new UserVo("박효신", 39, "서울"));
		list.add(new UserVo("전지현", 41, "부산"));

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("iotest/object_list.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);
			System.out.println("데이터베이스(.txt)에 저장완료.");

			fos.close();
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void load() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("iotest/object_list.txt");
			ois = new ObjectInputStream(fis);

			list = (ArrayList<UserVo>)ois.readObject();

			System.out.println("데이터베이스(.txt)에서 읽기 완료.");

			for(UserVo vo : list) {
				System.out.println("이름: " + vo.getName());
				System.out.println("나이: " + vo.getAge());
				System.out.println("지역: " + vo.getAddr());
				System.out.println("");
			}
			fis.close();
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
