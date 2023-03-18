package com.ayseozcan;

import java.util.Random;

public class ThreadSafe2 {

	private int count = 0;

	protected synchronized void uretimTuketim(int degisimSayisi) {
		count += degisimSayisi;
		if (degisimSayisi < 0) {
			System.out.println("stoktan mal cikisi");
		} else {
			System.out.println("stoga mal girisi");
			System.out.println("guncel stok : " + count);
		}

	}

	private void runThreads() {

		// uretici thread

		Thread ureticiThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("uretici thread calisti");
				for (int i = 0; i < 100; i++) {
					Random r = new Random();
					int uretimSayisi = r.nextInt(10);
					uretimTuketim(uretimSayisi);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				System.out.println("uretici thread bitti");
			}
		});

		Thread tuketiciThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("tuketici thread calisti");
				for (int i = 0; i < 100; i++) {
					Random r = new Random();
					int tuketimSayisi = r.nextInt(10);
					uretimTuketim(tuketimSayisi);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				System.out.println("tuketici thread bitti");
			}
		});

		ureticiThread.start();

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		tuketiciThread.start();

		try {
			ureticiThread.join();
			tuketiciThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		ThreadSafe2 threadSafe = new ThreadSafe2();
		threadSafe.runThreads();

	}

}
