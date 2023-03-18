package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main thread calisiyor");
		
		Yazici yaziciThread1 = new Yazici("Yazici Thread-1");
		Yazici yaziciThread2 = new Yazici("Yazici Thread-2");
		yaziciThread1.start();
		yaziciThread2.start();
		
		try {
			yaziciThread1.join(); // join() ile Main thread, yaziciThread1 ve 2 nin bitmesini bekler sonra biter.
			yaziciThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread bitti, cikiyor");
	}

}
