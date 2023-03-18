package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		System.out.println("main thread calisiyot");
		
		Thread yazici1 = new Thread(new Yazici("printer 1"));
		Thread yazici2 = new Thread(new Yazici("printer 2"));
		
		yazici1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		yazici2.start();
		
		
		try {
			yazici1.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
			e.printStackTrace();
		}
		
		System.out.println("main thread bitti cikiyor");
		
	}

}
