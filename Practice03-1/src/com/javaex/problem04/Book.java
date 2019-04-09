package com.javaex.problem04;

public class Book {
	// 필드
	private int bookNo;
	private String title;
	private String author;
    private int stateCode;
    
    // 생성자
    
    public Book(int bookNo,String title,String author) {
    	this.bookNo = bookNo; this.title = title; this.author = author;this.stateCode=1;
    }

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
    
    // 필요 메서드
	public void print() {
		System.out.printf("%d, 제목: %s, 작가: %s, 대여유무: %s%n", 
				bookNo, title, author, stateCode == 1? "재고 있음":"대여중");
	}
	public void rent() {
		if(stateCode == 1) {
			stateCode = 0;
			System.out.println(title + "이 대여되었습니다.");
		}else {
			System.out.println("대여중인 책입니다.");
		}
	}
    
    
    
    
}
