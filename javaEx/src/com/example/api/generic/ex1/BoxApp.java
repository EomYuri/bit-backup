package com.example.api.generic.ex1;

class Box{
	Object content;

	public void setContent(Object content) {
		this.content = content;
	}

	public Object getContent() {
		return content;
	}
}
public class BoxApp {

	public static void main(String[] args) {
		// Box 하나 만들고 int 담아봅시다
		Box intBox = new Box();
		intBox.setContent(123);
		
		// 값을 꺼내와 봅시다.
		System.out.println("intBox: " + intBox.getContent());
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		System.out.println("strBox: " +  strBox.getContent());
		
		String content = (String)strBox.getContent();
		System.out.println(content.toUpperCase());
		
		content = (String)strBox.getContent();
		System.out.println(content.toUpperCase());
		
		
		

	}

}
