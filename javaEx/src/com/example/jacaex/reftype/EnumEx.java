package com.example.jacaex.reftype;

public class EnumEx {

	public static void main(String[] args) {
		// Enum 타입의 사용
		Week today = Week.THURSDAY;
		
		System.out.printf("Today is %s(%d)", today.name(), today.ordinal());
		// 문자열을 가지고 내부에 열거 상수가 있는지 확인
		Week obj = Week.valueOf("FRIDAY");
		System.out.printf("%s(%d)%n", obj.name(), obj.ordinal());
		
		//앞에서 만들었던 요일별 활동
		
		String act = "";
		
		switch(today) {
		case SUNDAY:
			act = "휴식";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "공부";
			break;
		case FRIDAY:
			act = "불금";
			break;
		case SATURDAY:
			act = "방전";
			break;
		}
		
		System.out.printf("%s에는 %s 하자%n", today.name(),act);

	}

}
