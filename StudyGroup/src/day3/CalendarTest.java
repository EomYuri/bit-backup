package day3;

import java.io.IOException;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		Calendars cd = new Calendars();

		while(true) {
			System.out.print("Input year & month: ");
			//반복문 안됨
			cd.input();
			cd.data();
			cd.print();
			System.out.print("다시 입력하시겠습니까?<Y/N>: ");

			String answer = sc.next();
			switch(answer) {
			case "Y":
				continue;
			case "N":
				//				System.out.println("종료합니다.");
				break;
			default:
				//				System.out.println("종료합니다.");
				break;
			}

			System.out.println("종료합니다.");
			break;
			//switch

		}
		//			if(answer=="Y") {
		//				cd.input();
		//				cd.data();
		//				cd.print();
		//			}else if(answer=="N") {
		//				break;
		//			}else {
		//				break;
		//			}

	}//while

}



//입력받기


class Calendars{


	//생성자
	int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//	String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
	int day; //무슨요일부터인지 담을 변수
	int[] days; //해당 월에 며칠이 있는지 담을 변수
	int year;
	int month;
	int total;

	//데이터 입력
	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		//		System.out.print("Input year & month: ");
		year = sc.nextInt();
		month = sc.nextInt();
	}

	//계산
	public void data()
	{
		//윤년 판단
		if((year%4==0 && year%100!=0)||year%400==0) {	//윤년이면
			m[1] = 29;
		}else {	//평년이면
			m[1] = 28;
		}

		//이전 년도까지 날수 종합
		total = (year-1)*365+((year-1)/4-(year-1)/100+(year-1)/400);

		//이전 월까지 날 수 종합
		for(int a = 0; a<month-1; a++) {
			total += m[a];
		}

		//day에 잠깐 해당 월 날수 담기
		day = m[month-1];

		//days배열을 해당 월 날수만큼 칸 만들기
		days = new int[day];

		//days배열에 1부터 마지막 일까지 담기
		for(int a = 0; a<days.length; a++) {
			days[a] = a+1;
		}

		//무슨 요일인지부터인지 day에 담기
		day = (total+1)%7;//0~6 일~토 
	}

	//결과 출력
	public void print()
	{ 
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		
		for(int a = 0; a<day; a++) {
			System.out.print("    ");
		}
		for(int a = 0; a<days.length; a++) {
			System.out.printf("%3d ", days[a]);

			if((day+a+1)%7==0&&a!=days.length-1) {
				System.out.println();
			}

		}
//		for(int a = 1; a<=days.length; a++) {
//			if(day%7!=6)
//			{
//				System.out.printf("%3d",a);
//				day++;
//			}else if ((day+a+1)%7==0&&a!=days.length-1) {
//				System.out.println();
//			}
			
//		}
		System.out.println("\n------------------------------");
	}
}

