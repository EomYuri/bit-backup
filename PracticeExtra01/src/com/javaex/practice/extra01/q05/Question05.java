package com.javaex.practice.extra01.q05;

public class Question05 {
	private int scores[];

	public Question05(int scores[]) {
		this.scores = scores;
	}

	public int getTotal() {
		int total = 0;
		for (int i = 0; i<scores.length;i++){
			if(scores[i]>=0&&scores[i]<=100) {
				total += scores[i];
			}
		}
		return total;
	}

	public double getAverage() {
		int total = 0, count = 0;
		for (int i = 0; i<scores.length;i++){
			if(scores[i]>=0&&scores[i]<=100) {
				total += scores[i];
				count++;
			}
		}
		return total / count;
	}
}
