package com.bit.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDao {
	ArrayList<UserVo> list = new ArrayList<>();

	public void process() {
		save(); //������ �ܺο� ����. (����ȭ)
		load(); // �ܺ� ������ �о���δ�. (������ȭ)
	}
	private void save() {
		list.add(new UserVo("�ڽ���", 30, "����"));
		list.add(new UserVo("��ȿ��", 39, "����"));
		list.add(new UserVo("������", 41, "�λ�"));

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("iotest/object_list.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);
			System.out.println("�����ͺ��̽�(.txt)�� ����Ϸ�.");

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

			System.out.println("�����ͺ��̽�(.txt)���� �б� �Ϸ�.");

			for(UserVo vo : list) {
				System.out.println("�̸�: " + vo.getName());
				System.out.println("����: " + vo.getAge());
				System.out.println("����: " + vo.getAddr());
				System.out.println("");
			}
			fis.close();
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
