package com.ayseozcan;

public class Main {

	public static void main(String[] args) {

		// 3 tane farklı thread sınıfı oluşturun
		// 1.sınıf: 0-50 arasında 3'erli saysın
		// 2.sınıf: 0-50 arasında 5 erli saysın
		// 3.sınıf: 0-50 arasında 7şerli saysın
		// Aralarda 1 sn beklesin her 3 sınıf da..

		System.out.println("main thread calisiyor");
		
		Thread thread1 = new Thread(new WhatsApp("WhatsApp"));
		Thread thread2 = new Thread(new Telegram("Telegram"));
		Thread thread3 = new Thread(new Bip ("Bip"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.err.println("main thread bitti");
		
		
		
	}

}
