
package com.jspiders.multithreading.resource;

public class ShopMain {
	public static void main(String[] args) {
		Shop shop=new Shop(200);
		new Customer(shop, 100).start();
		new Customer(shop, 50).start();
		new Customer(shop, 90).start();
		new Customer(shop, 100).start();		
	}	
}
