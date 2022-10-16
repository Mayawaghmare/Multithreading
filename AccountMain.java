package com.jspiders.multithreading.account;

public class AccountMain {
	public static void main(String[] args) {
		Account account=new Account(600);
		Husband husband=new Husband(account);
		//Wife wife new Wife(account);
		husband.start();
		Account accout;
		Wife wife2 = new Wife(account);
		wife2.start();
		account.checkBalance();
	}

}
