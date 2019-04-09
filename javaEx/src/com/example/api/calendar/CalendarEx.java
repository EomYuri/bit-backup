package com.example.api.calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {

	public static void main(String[] args) {
		dateClassEx();
		calendarClassEx();
		
	}
	// Calendar 클래스 연습
	private static void calendarClassEx() {
		// Calendar 얻어오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		// 날짜 데이터의 설정 : set
		custom.set(2012, 8, 24); // 주의 : 월은 0부터 시작 ->2012년 9월 24일
		
		// 캘린더로부터 데이터를 불러와 봅시다.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", year, month+1, date);
		// 월은 0부터  0-> 1월
		
		Calendar future = Calendar.getInstance(); //현재시간
		future.add(Calendar.YEAR, 10);
		System.out.printf("FUTURE: %d년 %d월 %d일%n",  future.get(Calendar.YEAR),future.get(Calendar.MONTH)+1,future.get(Calendar.DATE));
		
		//이 날은 무슨 요일일까 : Calendar.DAY_OF_WEEK
		int dow = future.get(Calendar.DAY_OF_WEEK);
		String dowStr;
		System.out.println("요일: " + dow);
		
		switch(dow) {
		case Calendar.SUNDAY:
		dowStr = "일요일";
				break;
		case Calendar.MONDAY:
		dowStr = "월요일";
				break;
		case Calendar.TUESDAY:
		dowStr = "화요일";
				break;
		case Calendar.WEDNESDAY:
		dowStr = "수요일";
				break;
		case Calendar.FRIDAY:
		dowStr = "목요일";
				break;
		case Calendar.SATURDAY:
		dowStr = "금요일";
				break;
		default:
		dowStr = "?";
		}
		System.out.println(dowStr);
		
	}

	private static void dateClassEx() {
		// 날짜를 얻어옵니다.
		Date now = new Date();
		System.out.println(now);
		
		// 형식에 맞게 출력해봅시다.
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("DF FULL: "+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("DF LONG: "+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("DF SHORT: "+df.format(now));
		
		// SimpleDateFormat의 활용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(now));
		
	}

}
