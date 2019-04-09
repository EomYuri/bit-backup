package com.example.oop.goods.v3;
// 가능하면 한 클래스는 한 파일에 넣어라

// 클래스의 선언, 필드추가
class Goods{ 
	// 필드 : 은닉(캡슐화)
	private String name;  
	private int price;
	// 생성자
	/*
	 * public Goods() { // 기본 생성자
	 * 
	 * }
	 */
	public Goods(String name) {
		super();
		this.name = name;
	}
	
	public Goods(String name, int price) {
//		this.name = name;
		this(name);
		this.price = price;
	}
	
	// Getter, Setter
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public int getPrice() {
		return price;
	}
	/*
	 * public void setPrice(int price) { this.price = price; }
	 */
	
	// 메서드
	
	public void showInfo() {
		System.out.println("상품명: "+name);
		System.out.println("가격: "+price);
	}
}

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods("Samsung Notebook 9",1800000);
		/*
		 * notebook.setName("Samsung Notebook 9"); notebook.setPrice(1800000);
		 */
		
		Goods camera = new Goods("Nikon",700000);
		/*
		 * camera.setName("Nikon"); camera.setPrice(70000);
		 */
		
		/*
		 * System.out.printf("Goods[%s] price : %d%n",notebook.getName(),notebook.
		 * getPrice());
		 * System.out.printf("Goods[%s] price : %d%n",camera.getName(),camera.getPrice()
		 * );
		 */
		notebook.showInfo();
		camera.showInfo();
		
		
	}

}
