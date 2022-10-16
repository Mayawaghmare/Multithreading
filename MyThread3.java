package com.jspiders.multithreading.threads;

public class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("THREAD 3 IS RUNNING NOW.");
		super.run();
	}
}
