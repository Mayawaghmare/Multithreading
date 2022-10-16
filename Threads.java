package com.jspiders.multithreading.threads;

public class Threads extends Thread{
	@Override
	public void run() {
		System.out.println("THREAD IS RINNING...");
	}
	public static void main(String[] args) {
		Thread thread=new Thread();
		thread.setName("MY DEMO THREAD IS RUNNING");
		thread.setPriority(10);
		System.err.println(thread.getPriority());
		thread.start();
	}

}
