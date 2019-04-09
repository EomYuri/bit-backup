package com.example.phonebook;

import java.util.List;
import java.util.Scanner;

import com.example.phonebook.dao.PhoneBookDAO;
import com.example.phonebook.dao.PhoneBookDAOImpl;
import com.example.phonebook.vo.PhoneBookVO;

public class PhoneBook {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("*************************************");
		System.out.println("*          전화번호 관리 프로그램                *");
		System.out.println("*************************************");
		while(true) {
			System.out.println();
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료            ");
			System.out.println("----------------------------------");
			System.out.print(">메뉴번호:");

			int menuNo =sc.nextInt();
			System.out.println();
			
			switch(menuNo) {

			case 1:
				printPhoneBook();
				break;
			case 2:
				System.out.println("<2.등록>");
				System.out.print(">이름: ");
				sc.nextLine();				
				String PBname = sc.nextLine();
				System.out.print(">휴대전화: ");
				String PBhp = sc.nextLine();
				System.out.print(">집전화: ");
				String PBtel = sc.nextLine();
				insertPhoneBook(PBname, PBhp, PBtel);
				break;
			case 3:
				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				sc.nextLine();
				Long Delid = sc.nextLong();
				deletePhoneBook(Delid);
				break;
			case 4:
				System.out.println("<4.검색>");
				System.out.print(">이름: ");
				sc.nextLine();
				String SearchName = sc.nextLine();
				findPhoneBookByName(SearchName);
				break;
			case 5:
				System.out.println("*************************************");
				System.out.println("*               감사합니다                       *");
				System.out.println("*************************************");
				break;
			default :
				System.out.println("[다시입력해주세요]");
				break;

			}// switch

			if(menuNo==5) {
				break;
			}

		}//while
		sc.close();

	}
	private static void printPhoneBook() {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		List<PhoneBookVO> list = dao.getList();
		
		System.out.println("<1.리스트>");
		for(PhoneBookVO phonebookVO: list) {
			System.out.printf("%d. %s %s %s\n", 
					phonebookVO.getId(),
					phonebookVO.getName(),
					phonebookVO.getHp(),
					phonebookVO.getTel()
					);
		}
		
	}
	
	private static void insertPhoneBook(String name, String hp, String tel) {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		PhoneBookVO phonebookVO = new PhoneBookVO(null, name, hp, tel);
		boolean success = dao.insert(phonebookVO);

		if(success) {
			System.out.printf("등록되었습니다.%n", phonebookVO);
		}else {
			System.out.printf("등록되지 않았습니다.%n", phonebookVO);
		}
		
	}
	
	private static void deletePhoneBook(Long delid) {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		boolean success = dao.deldete(delid);
		
		if(success) {
			System.out.printf("삭제되었습니다.%n");
		}else {
			System.out.printf("삭제되지 않았습니다.%n");
		}
	}
	
	private static void findPhoneBookByName(String name) {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		PhoneBookVO phonebookVO = dao.get(name);
		
		if(phonebookVO == null) {
			System.out.println("찾지 못했습니다.");
		}else {
			System.out.printf("%d. %s %s %s\n", 
					phonebookVO.getId(),
					phonebookVO.getName(),
					phonebookVO.getHp(),
					phonebookVO.getTel()
					);
		}
	}

}

