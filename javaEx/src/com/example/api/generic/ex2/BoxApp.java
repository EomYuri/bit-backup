package com.example.api.generic.ex2;

// 제네릭 클래스

class Box<T>{
	T content;

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
}
public class BoxApp {

	public static void main(String[] args) {
		// Box 하나 만들고 int 담아봅시다
		Box<Integer> intBox = new Box<Integer>();
		intBox.setContent(123);

		// 값을 꺼내와 봅시다.
		System.out.println("intBox: " + intBox.getContent());

		Box<String> strBox = new Box<>();
		strBox.setContent("Java");

		System.out.println("strBox: " +  strBox.getContent());

		String content = strBox.getContent();
		System.out.println(content.toUpperCase());

		/*	컴파일시 오류 체크 가능 -> 안전성 확보 
		  content = (String)strBox.getContent();
		  System.out.println(content.toUpperCase());
		 */

	}

}
