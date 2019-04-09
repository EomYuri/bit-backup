package day2.product;

public class CompactDisc extends Product{
	private String title;
	private String singer;
	
	public CompactDisc(int id, String explanation, String constructor, int price, String title, String singer) {
		super(id, explanation, constructor, price);
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("앨범 제목>>"+getTitle());
		System.out.println("가수>>"+getSinger());
	}
	
//	public void showInfo() {
//		System.out.println("상품ID>>" +getId());
//		System.out.println("상품 설명>>" + getExplanation());
//		System.out.println("생산자>>"+ getConstructor());
//		System.out.println("가격>>"+ getPrice());
//		System.out.println("앨범 제목>>"+getTitle());
//		System.out.println("가수>>"+getSinger());
//		
//	}
	
	

}
