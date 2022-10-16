package com.jspiders.multithreading.resource;

	public class Manufacturer extends Thread {
		Short shop;
		int restockItems;
		public Manufacturer (Short shop,int restockItems) {
			super();
			this.shop=shop;
			this.restockItems=restockItems;
		}
		
		@Override
		public void run() {
			super.run();
		}
		}

	



