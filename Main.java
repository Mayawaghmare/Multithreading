package com.jspiders.multithreading.threads;

public class Main {
	public static void main(String[] args) {
		MyThread1 myThread1= new MyThread1();
		//myThread1.setPriority(8);
		myThread1.start();
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		//thread.setPriority(12);
		thread.start();
	}
}
		




