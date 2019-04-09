package com.example.oop.goods.v1;
// 가능하면 한 클래스는 한 파일에 넣어라

// 클래스의 선언, 필드추가
class Goods{ 
	// 필드
	String name;  
	int price;
	
}

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name = "Samsung Notebook 9";
		notebook.price = 1800000;
		
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 700000;
		
		System.out.printf("Goods[%s] price : %d%n",notebook.name,notebook.price);
		System.out.printf("Goods[%s] price : %d%n",camera.name,camera.price);

	}

}
