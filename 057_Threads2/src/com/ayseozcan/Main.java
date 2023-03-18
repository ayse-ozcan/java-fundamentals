package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("main thread calisiyot");
		
		Yazici yaziciThread1 = new Yazici("Yazici thread 1");
		Yazici2 yaziciThread2 = new Yazici2("Yazici thread 2");
		
		yaziciThread1.start();
		yaziciThread2.start();
		
		
		try {
			yaziciThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread bitti cikiyor");
		

	}

}
