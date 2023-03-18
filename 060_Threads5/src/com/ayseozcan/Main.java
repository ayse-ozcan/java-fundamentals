package com.ayseozcan;

public class Main {
	//Thread olusturma 3. yontem
	// Anonymous Inner class ile interface uzerinden thread olusturma
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main thread calisiyor");

		Thread printer1 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("thread1 calisiyor");
				for (int i = 0; i <= 5; i++) {
					System.out.println("thread1 yaziyor " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("thread1 cikiyor");

			}
		});

		Thread printer2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread2 calisiyor");
				for (int i = 0; i <= 7; i++) {
					System.out.println("thread2 yaziyor " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("thread2 cikiyor");

			}

		});

		printer1.start();
		printer2.start();
		System.out.println("main thread cikiyor");
	}

}
