package com.example.javaex.conditional;

public class SwitchEx3 {
	// TODO : 나중에 Enum으로 재작성
	public static void main(String[] args) {
		String day = "THURSDAY";
		String act = "";
		
		switch(day) {
		case "SUNDAY":
			act = "휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "공부";
			break;
		case "SATURDAY":
			act = "방전";
			break;
		default:
			act = "?";
		}
		
		System.out.println(day + "엔 " + act);
		
	}
}
