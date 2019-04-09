package day2.product;

public class Book extends Product {
	private String ISBN;
	private String author;
	private String bookName;
	
	public Book(int id, String explanation,String constructor, int price, String ISBN, String author, String bookName) {
		super(id, explanation, constructor, price);
		this.ISBN =ISBN;
		this.author = author;
		this.bookName = bookName;
	}
//	public Book(String explanation, String constructor, int price, String ISBN, String author, String bookName) {
//		super(explanation, constructor, price);
//		this.ISBN =ISBN;
//		this.author = author;
//		this.bookName = bookName;
//	}
	

	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("ISBN>>"+getISBN());
		System.out.println("저자>>"+getAuthor());
		System.out.println("책 제목>>"+getBookName());
	}
	
//	public void showInfo() {
//		System.out.println("상품ID>>"+getId() );
//		System.out.println("상품 설명>>" + getExplanation());
//		System.out.println("생산자>>"+ getConstructor());
//		System.out.println("가격>>"+ getPrice());
//		System.out.println("ISBN>>"+getISBN());
//		System.out.println("저자>>"+getAuthor());
//		System.out.println("책 제목>>"+getBookName());
//		
//	}
	

}
