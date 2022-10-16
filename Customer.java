package com.jspiders.multithreading.resource;

	public class Customer extends Thread {
		private static final int Purches = 0;
		Shop shop;
		int PurchesItems;
		public Customer(Shop shop2,int PurchesItems) {
			super();
			this.shop=shop2;
			int Purches = 0;
			this.PurchesItems=Purches;	
		}
		
		@Override
		public void run() {
			shop=shop(PurchesItems);
		}
		private Shop shop(int purchesItems2) {
			// TODO Auto-generated method stub
			return null;
		}
	}


