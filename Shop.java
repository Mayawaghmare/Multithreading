
package com.jspiders.multithreading.resource;

public class Shop {
	int availableItems;
	public Shop (int availableItems) {
		super();
		this.availableItems=availableItems;	
	}
	public synchronized void reStock(int noOfItems) {
		availableItems +=noOfItems;
		System.out.println("Successfully store" +noOfItems+ "Items is in stock");
		this.notify();
	}
	public synchronized void Purxhes(int noOfItems) {
		if (availableItems<noOfItems) {
			System.out.println("Items out of stock please Wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		availableItems=noOfItems;
		System.out.println("Purches of" + noOfItems + "Items successfully");
		
	}
		
	}
		
	

