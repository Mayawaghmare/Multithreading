package com.jspiders.multithreading.account;

public class Wife extends Thread{
	Account account;
	public Wife  ( Account account) {
		super();
		this.account=account;
	}
	@Override
	public void run() {
	Thread.currentThread().setName("WIFE Threaf");
	System.out.println("current running : " + Thread.currentThread().getName());
	account.Deposit(1000);
	account.Withdraw(900);
	}
}


