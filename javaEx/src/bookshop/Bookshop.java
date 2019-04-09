package bookshop;

import java.util.List;

public class Bookshop {

	public static void main(String[] args) {
//		printAuthors();
//		insertAuthor("엄유리", "큐티뽀짝");
//		updateAuthor(23L, "엄유리", "데이터 변경" );
//		deleteAuthor(30L);
		findAuthorById(3L);
		findAuthorById(4L);
	}
	private static void findAuthorById(Long id) {
		AuthorDAO dao = new AuthorDAOImpl();
		AuthorVO authorVO = dao.get(id);
		
		if(authorVO == null) {
			System.out.println("작가를 찾지 못했습니다.");
		}else {
			System.out.printf("작가 %s를 찾았습니다.%n", authorVO);
		}
	}
	
	private static void deleteAuthor(Long id) {
		AuthorDAO dao = new AuthorDAOImpl();
		boolean success = dao.deldete(id);
		
		if(success) {
			System.out.printf("작가 %d를 삭제하였습니다.%n", id);
		}else {
			System.out.printf("작가 %d를 삭제하지 못했습니다.%n", id);
		}
	}
	
	private static void updateAuthor(Long id, String name, String desc) {
		AuthorDAO dao = new AuthorDAOImpl();
		AuthorVO authorVO = new AuthorVO(id, name, desc);
		
		boolean success = dao.update(authorVO);
		
		if(success) {
			System.out.printf("저자 %s를 갱신하였습니다.", authorVO);
		}else {
			System.out.printf("저자 %s를 갱신하지 못했습니다.", authorVO);
		}
		printAuthors();
	}
	private static void insertAuthor(String name, String desc) {
		AuthorDAO dao = new AuthorDAOImpl();
		AuthorVO authorVO = new AuthorVO(null, name, desc);
		
		boolean success = dao.insert(authorVO);
		
		if(success) {
			System.out.printf("저자 %s를 추가했습니다.%n", authorVO);
		}else {
			System.out.printf("저자 %s를 추가하지 못했습니다.%n", authorVO);
			
		}
		printAuthors();
	}
	
	private static void printAuthors() {
		AuthorDAO dao = new AuthorDAOImpl();
		List<AuthorVO> list = dao.getList();
		
		System.out.println("====== 저자목록 =====");
		for(AuthorVO authorVO: list) {
			System.out.println(authorVO);
		}
	}

}
