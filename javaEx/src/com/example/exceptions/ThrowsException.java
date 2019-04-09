package com.example.exceptions;

import java.io.IOException;

public class ThrowsException {

	public void executeException() throws IOException {
		System.out.println("강제 예외 발생");
		// 강제로 IOException을 발생시켜 외부로 넘겨주기
		throw new IOException("강제 예외");
		
	}
	
	public void executeRuntimeException() {
		System.out.println("런타임 예외");
		throw new RuntimeException("Runtime Exception");
	}
	
	// 사용자 정의 예외 throw
	public double executeCustomException (int num1, int num2) {
		if (num2==0) {
			throw new CustomArithmeticException(num1, num2);
		}
		return num1/num2;
	}
}
