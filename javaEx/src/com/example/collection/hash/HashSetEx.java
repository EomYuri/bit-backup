package com.example.collection.hash;

import java.util.HashSet;

class Student{
	// 필드
	
	String name;
	int id;
	
	// 생성자
	public Student(String name, int id) {
		this.name = name; this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student)obj;
			return name.contentEquals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}

public class HashSetEx {

	public static void main(String[] args) {
//		hashSetBasic();
		hashSetCustom();
		
		

	}
	

	// 사용자 정의 객체의 hash
	private static void hashSetCustom() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("망고", 10);
		Student s2 = new Student("라임", 20);
		Student s3 = new Student("망고", 10);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생명부: "+hs);
		System.out.println("학생수: "+hs.size());
	}
	private static void hashSetBasic() {
		//해시셋 선언
		HashSet<String> hs = new HashSet<>();
		
		//객체추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		hs.add("Java");  // 공동 객체는 추가되지 않음
		System.out.println(hs);
		System.out.println("HS size: "+hs.size());
		
		
		// 객체 삭제
		hs.remove("C++");
		System.out.println(hs);
		
		// 객체 포함 여부
		System.out.println(hs.contains("Python"));
		System.out.println(hs.contains("Linux"));
		
	}

}
