package com.ayseozcan;

public class Main {

	public static void main(String[] args) {

		Stock1 stock = new Stock1();
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				stock.produce();

			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				stock.consume();

			}
		});
		
		producer.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
