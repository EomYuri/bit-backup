package day2.product;

import java.util.Scanner;

public class ProductInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Product[] product = new Product[10];  
		int id=0;
		
		while(run) {
			System.out.println("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3>>>");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(id>=10) {
				System.out.println("최대 10개의 상품을 추가할 수 있습니다.");
				continue;
			}

			switch(num) {

			case 1:
				System.out.println("상품 종류 책<1>, 음악CD<2>, 회화책<3>>>");
				int num1 = Integer.parseInt(sc.next());
				sc.nextLine();
				switch(num1) {
				case 1:
					System.out.println("상품 설명>>");
					String bookExp = sc.nextLine();
					System.out.println("생산자>>");
					String bookCon = sc.nextLine();
					System.out.println("가격>>");
					int bookPrice = sc.nextInt();
					sc.nextLine();
					System.out.println("ISBN>>");
					String bookISBN = sc.nextLine();
					System.out.println("저자>>");
					String bookAuthor = sc.nextLine();
					System.out.println("책 제목>>");
					String bookName = sc.nextLine();

					Book book = new Book(id, bookExp, bookCon, bookPrice, bookISBN, bookAuthor, bookName) ;
					product[id] = book;
					id++;
					break;
				case 2:

					System.out.println("상품 설명>>");
					String comExp = sc.nextLine();
					System.out.println("생산자>>");
					String comCon = sc.next();
					System.out.println("가격>>");
					int comPrice = sc.nextInt();
					System.out.println("앨범 제목>>");
					String comTitle = sc.next();
					System.out.println("가수>>");
					String comSinger = sc.next();

					CompactDisc compactdisc = new CompactDisc(id, comExp, comCon, comPrice, comTitle, comSinger) ;
					product[id] = compactdisc;
					id++;
					break;
				case 3:
					System.out.println("상품 설명>>");
					String conExp = sc.next();
					System.out.println("생산자>>");
					String conCon = sc.next();
					System.out.println("가격>>");
					int conPrice = sc.nextInt();
					System.out.println("책 제목>>");
					String conName = sc.next();
					System.out.println("저자>>");
					String conAuthor = sc.next();
					System.out.println("언어>>");
					String conlanguage = sc.next();
					System.out.println("ISBN>>");
					String conISBN = sc.next();

					ConversationBook conversation = new ConversationBook(id, conExp, conCon, conPrice,  conISBN,  conAuthor,conName, conlanguage) ;

					product[id] = conversation;
					id++;
					break;
				default:
					System.out.println("다시 입력해 주세요");
					break;
				}// inner switch
				break;
			case 2:
				for (int a = 0; a < product.length; a++) {
					if(product[a]!=null) {
						product[a].showInfo();
						System.out.println();
					}
				}
				break;
			case 3:
				break;
			default:
				System.out.println("다시 입력해 주세요");
				break;
			}
			if(num==3) {
				break;
				
			}//switch

		}//while
		sc.close();

	}
}
