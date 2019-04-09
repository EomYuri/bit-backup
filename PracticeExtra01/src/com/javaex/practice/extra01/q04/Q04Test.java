package com.javaex.practice.extra01.q04;

public class Q04Test {
	
	public static void main(String[] args) {
		//	Begin:	이곳의 코드는 수정하지 않습니다. 
		DiceSimulator dc = new DiceSimulator();
		
		dc.showDices();
		
		printPossibility(dc, 6, 6);
		printPossibility(dc, 10, 6);
		printPossibility(dc, 100, 6);
		//	End:	이곳의 코드는 수정하지 않습니다.
		
		//	Note: 다른 경우의 테스트를 위하 아래쪽 코드 영역을 활용하셔도 좋습니다.
		printPossibility(dc, 1000, 6);
	}
	
	private static void printPossibility(DiceSimulator simulator, 
			int count, 
			int num) {
		System.out.println("==========");
		simulator.simulate(count);
		simulator.showDices();
		System.out.printf("%d번 주사위를 던졌을 때\n\t%d(이)가 나온 실제 빈도율: %f%n", count, num, simulator.getPossibility(6));
		System.out.println("==========");
	}
}
