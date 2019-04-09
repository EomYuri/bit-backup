package day2.product;

public class ConversationBook extends Book {
	private String language;
	
	public ConversationBook(int id, String explanation, String constructor, int price, String ISBN, String author, String bookName, String language) {
		super(id, explanation, constructor, price, ISBN, author, bookName);
		this.language = language;
		
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("ISBN>>"+getISBN());
		System.out.println("저자>>"+getAuthor());
		System.out.println("책 제목>>"+getBookName());
		System.out.println("언어>>"+getLanguage());
	}
	
//	public void showInfo() {
//		System.out.println("상품ID>>"+getId() );
//		System.out.println("상품 설명>>" + getExplanation());
//		System.out.println("생산자>>"+ getConstructor());
//		System.out.println("가격>>"+ getPrice());
//		System.out.println("ISBN>>"+getISBN());
//		System.out.println("저자>>"+getAuthor());
//		System.out.println("책 제목>>"+getBookName());
//		System.out.println("언어>>"+getLanguage());
//	}

}
