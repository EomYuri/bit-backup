package com.example.thread;

// Thread 클라스의 상속을 통한 Thread 생성
class DigitThread extends Thread{

	//  쓰레드에서 시행할 로직 코드 작성
	@Override
	public void run() {
		for(int i = 0; i<30; i++) {
			System.out.println("[DigitalThread}" + i);
			// 쓰레드 지연
			try {
				Thread.sleep(200);  // 0.3sec
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		super.run();
	}
	
}
public class MainThread {

	public static void main(String[] args) {
		// 메인 쓰레드의 로직
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println("[MainThread]" + ch);
			
			// 메인 쓰레드 속도 지연
			try {
				Thread.sleep(300);  // 0.3sec
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
