
package com.jspiders.multithreading.sleep;

public class Sleep {
	public static void main(String[] args) {
		System.out.println("Main Class Statement 1");{
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Class Statement 2");{
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
			}
		System.out.println("Main Class Statement 3");

		try {
			Thread.sleep((long) 1000.00);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Class Statement 4");
		System.out.println("Main Class Statement 5");
		System.out.println("Main Class Statement 6");

		}	
	}
  }
}





