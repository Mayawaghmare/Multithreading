package com.jspiders.multithreading.sleep;

public class SleepDemo {

	public static void main(String[] args) {
		String str = "This is the magic of sleep() method";
		char[] charArray = str.toCharArray();
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < str.length(); i++) {
				System.out.print(charArray[i]);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}

}
