package com.example.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터의 선언
		Vector<Integer> v = new Vector<>();

		// 사이즈와 허용량
		System.out.println("Size: "+v.size()+", Capacity: "+v.capacity());

		for(int i =1; i <= 10; i++) {
			// 객체의 추가
			v.addElement(i);
		}
		// 사이즈와 허용량
		System.out.println("Size: "+v.size()+", Capacity: "+v.capacity());

		v.addElement(11); // 허용량 초과
		// 사이즈와 허용량
		System.out.println("Size: "+v.size()+", Capacity: "+v.capacity());
		
		// 중간에 객체를 넣어봅시다.
		v.insertElementAt(5, 7);
		System.out.println(v);
		
		// 객체 조회 : indexOf
		int val = v.indexOf(5);
		System.out.println("객체 5의 인덱스: "+val);
		// 없는 객체의 인덱스
		System.out.println(v.indexOf(15)); // -1
		
		// 객체 포함 여부 판단
		System.out.println("contains 10?"+v.contains(10));
		System.out.println("contains 15?"+v.contains(15));
		
		// 객체 삭제 : removeElement
		v.removeElement(10);
		System.out.println(v);
		
//		for(int i = 0; i < v.size(); i++) {
//			Integer item = v.elementAt(i);
//			System.out.println(item);
//		}
		// TODO : Enumeration으로 루프 돌기
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer item = e. nextElement();
			System.out.println(item);
		}
		
		// 버퍼를 비워봅시다.
		v.clear();
		System.out.println("size:"+v.size()+", capascity"+v.capacity());
		
		// Generic의 활용
		Vector < ? super Number> v2 = new Vector<>();
	      v2.addElement(Integer.valueOf(10));
	      v2.addElement(Float.valueOf(3.14159f));
	      
	      System.out.println(v2);
		

	}

}
