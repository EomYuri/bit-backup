package com.javaex.problem03;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account (String accountNo) {
    	this.accountNo = accountNo;
    }
    

	//필요한 메소드 작성
	
	public void deposit(int money) {	// 입급
		this.balance += money;
	}

	public void withdraw(int money) {	// 출금
		this.balance -= money;
	}
	public void showBalance() {		// 잔액 보기
		System.out.println(balance);
	}
    
}
