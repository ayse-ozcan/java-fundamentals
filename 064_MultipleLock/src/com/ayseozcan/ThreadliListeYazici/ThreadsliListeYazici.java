package com.ayseozcan.ThreadliListeYazici;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsliListeYazici {

	ArrayList<Integer> liste1 = new ArrayList<>();
	ArrayList<Integer> liste2 = new ArrayList<>();

	Random random = new Random();

	public synchronized void listDegerEkle() {

		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		liste1.add(random.nextInt(100));
	}

	public synchronized void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		liste2.add(random.nextInt(100));
	}

	public void listelereDegerEkle() {
		for (int i = 0; i < 500; i++) {
			listDegerEkle();
			list2DegerEkle();
		}
		// System.out.println("liste1 size : " + liste1.size() + " " + "liste2 size :" +
		// liste2.size());
	}

	public void threadlerOlustur() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				listelereDegerEkle();
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				listelereDegerEkle();
			}
		});
		long baslangic = System.currentTimeMillis();
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("liste1 size : " + liste1.size() + " " + "liste2 size :" + liste2.size());
		long bitis = System.currentTimeMillis();
		System.out.println("Toplam sure" + (bitis - baslangic));
	}
}
