package com.jspiders.multithreading.threads;

public class MyThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			
		}
		System.out.println("THREAD 1 IS NOW RUNNING..");
		super.run();
	}

}
