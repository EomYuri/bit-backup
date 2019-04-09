package day2.product;

public class Product {
	private int id;
	private String explanation;
	private String constructor;
	private int price;
	
	public Product(int id, String explanation, String constructor, int price) {
		this.id = id;
		this.explanation = explanation;
		this.constructor = constructor;
		this.price = price;
	}
//	public Product(String explanation, String constructor, int price) {
//		this.explanation = explanation;
//		this.constructor = constructor;
//		this.price = price;
//	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getConstructor() {
		return constructor;
	}

	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품ID>>"+getId() );
		System.out.println("상품 설명>>" + getExplanation());
		System.out.println("생산자>>"+ getConstructor());
		System.out.println("가격>>"+ getPrice());
		
	}


}
