package com.example.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// 생성
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		// 객체 추가 : add
		lst.add("Java");
		lst.add("Python");
		lst.add("C");
		lst.add("C++");
		
		// 객체 삽입
		lst.add(2, "C#");
		
		// List는 중복 삽입을 허용
		lst.add("Java");
		
		System.out.println(lst);
		System.out.println("총 객체수: "+lst.size());
		
		// 객체를 지워봅시다. : remove
		lst.remove(2);
		lst.remove("Python");
		System.out.println(lst);
		// TODO: Iterator를 이용한 루프
		Iterator<String> iter = lst.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println("item: "+item);
		}
		
		// 비워봅시다.
		lst.clear();
		System.out.println(lst);
		
	}

}
