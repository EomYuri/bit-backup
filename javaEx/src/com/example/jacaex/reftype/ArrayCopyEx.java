package com.example.jacaex.reftype;

// 배열의 복제, Enhanced For Loop
public class ArrayCopyEx {

	public static void main(String[] args) {
		// 배열을 크기변경 되지 않으므로 새 배열을 만들어서 복사
		int source[] = {1,3,5};
		int target[] = new int[10];

		// 복사
		for(int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		// 확인
		for(int i = 0; i < target.length; i++) {
			System.out.print(target[i]+" ");
		}
		System.out.println();
		
		// System.arrarycopy를 이용한 배열의 복사
		// int source[] = {1,3,5};
		int target2[] = new int[10];
		System.arraycopy(source, // 원본 배열
				0, // 복사 시작 인덱스(원본의)
				target2, // 복사 대상 배열
				4, // 대상 배열의 복사 시작 인덱스
				source.length); // 복사할 길이
		for(int i = 0; i < target2.length; i++) {
			System.out.print(target2[i]+" ");
		}
		System.out.println();
		
		// Enhanced For Loop
		for( int val:target2) {
			System.out.print(val+" ");
		}
		System.out.println();

	}
}
