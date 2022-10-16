
package com.jspiders.multithreading.account;

public class Account {
	int balance;
	 public Account(int balance) {
		this.balance=balance;
		
	}
	 
	 //withdraw
	 public void Withdraw(int amount) {
		 if (balance>amount) {
			 balance-=amount;
			 System.out.println(amount + " RS. Withdraw successfully");
			
		}
		 else {
			System.out.println("insufficient balance");
		}
		 System.out.println("The Current balance is:" + this.checkBalance());
		}
	 
	 //deposit
	 public void Deposit(int amount) {
		 balance =balance + amount;
		 balance +=amount;
		 System.out.println(amount + "RS. DEPOSITED SUCCESSFULLY");
		 System.out.println("The current balance is:" +this.checkBalance());
		 	
	}

	int checkBalance() {
		return balance;
	}

}
