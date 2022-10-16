package com.jspiders.multithreading.threads;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.setPriority(8);
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		myThread2.setPriority(10);
		
		MyThread3 myThread3=new MyThread3();
		myThread3.setPriority(1);
		
		MyThread4 myThread4=new MyThread4();
		myThread4.setPriority(7);
		
		myThread1.start();
		thread.start();
		myThread3.start();
		myThread4.start();
		
		
	}

}
