package phoneproject;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> address = new ArrayList<Address>();
		boolean run = true;

		while(run) {
			System.out.println("*************************************");
			System.out.println("*          전화번호 관리 프로그램                *");
			System.out.println("*************************************");
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료            ");
			System.out.println("----------------------------------");
			System.out.print(">메뉴번호:");

			int menuNo =sc.nextInt();

			switch(menuNo) {

			case 1:
				System.out.println();
				System.out.println("<1.리스트>");
				PhoneList.save();
				break;
			case 2:
				System.out.println();
				System.out.println("<2.등록>");
				Register.RegisterMem();
				break;
			case 3:
				System.out.println();
				System.out.println("<3.삭제>");
				Delete.del();
				break;
			case 4:
				System.out.println();
				System.out.println("<4.검색>");
				Search.search();
				break;
			case 5:
				System.out.println();
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

}

