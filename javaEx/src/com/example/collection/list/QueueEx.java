package com.example.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 생성
		Queue<Integer> queue = new LinkedList<>();
		
		// Data 적재
		for(int i = 1; i <= 10; i++) {
			queue.offer(i); //enqueue
			System.out.println(queue);
		}
		
		// Queue의 가장 먼저 입력된 앞쪽 데이터 확인
		System.out.println(queue.peek());
		System.out.println(queue);
		// 데이터 인출
		System.out.println(queue.poll());
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
			System.out.println(queue);
		}

	}

}
