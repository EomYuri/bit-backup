package com.javaex.practice.extra01.q05;

import java.util.Arrays;

public class Q05Test {

	public static void main(String[] args) {
		//	scores의 값은 테스트를 위하여 변경해 보셔도 좋습니다.
		int scores[] = { 90, 80, 110, 100, 65, -1, 75, 85, 70 };
		
		//	Begin:	이곳의 코드는 수정하지 않습니다
		Question05 q = new Question05(scores);
		
		System.out.println("성적 데이터 원본: " + Arrays.toString(scores));
		System.out.println("\t합계 : " + q.getTotal());
		System.out.println("\t평균 : " + q.getAverage());
		//	End:	이곳의 코드는 수정하지 않습니다
	}
}
