package com.ayseozcan;

import java.util.Scanner;

public class Test {

	private Object lock = new Object();

	public void thread1Metod() {

		synchronized (lock) {
			System.out.println("Thread1 is running");
			System.out.println("Thread1 waits");

			try {
				lock.wait();
				// beklemede isteyen lock i alabilir.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread1 awaked and continue");
		}
	}

	public void thread2Metod() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (lock) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Thread2 is running");
			System.out.println("lutfen sayi giriniz");
			scanner.nextInt();

			lock.notify();
			System.out.println("Thread2 quits");

		}
	}
}
