package com.jspiders.multithreading.account;

public class Husband  extends Thread{
	Account account;
	public Husband ( Account account) {
		super();
		this.account=account;
	}
	@Override
	public void run() {
	Thread.currentThread().setName("Husband Threaf");
	System.out.println("current running : " + Thread.currentThread().getName());
	account.Deposit(17000);
	account.Withdraw(1000);
	}
}
