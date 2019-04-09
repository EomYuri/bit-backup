package com.example.collection;

import java.util.Hashtable;
import java.util.Map;

class ClassRoom{
	private String subject;
	private String roomName;

	// 생성자
	public ClassRoom(String subject) {
		this.subject = subject;
	}

	public ClassRoom(String subject, String roomName) {
		this.subject = subject; this.roomName = roomName;
	}

	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			return obj.hashCode() == this.hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
}

public class HashTableEx {

	public static void main(String[] args) {
		// HashTable 생성
		Map<String, ClassRoom> map = new Hashtable<>();

		// 맵에 데이터 넣기
		map.put("101", new ClassRoom("Java", "101"));
		map.put("202", new ClassRoom("C", "202"));
		map.put("303", new ClassRoom("Python", "303"));

		System.out.println(map);

		// 맵에서 데이터 가져오기 : get
		System.out.println("KEY 303: "+map.get("303"));

		// 맵의 데이터 변경
		map.put("202", new ClassRoom("C#", "R202"));
		System.out.println(map);

		// 특정 키가 맵 안에 있는지 확인
		System.out.println(map.containsKey("202"));
		System.out.println(map.containsKey("502"));

		// subject가 Java인 ClassRoom을 받아와 봅시다
		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));

		map.clear();
		System.out.println(map);


	}

}
