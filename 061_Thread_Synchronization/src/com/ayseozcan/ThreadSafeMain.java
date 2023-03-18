package com.ayseozcan;

public class ThreadSafeMain {

	private int count = 0;

	// synchronized metodlari ayni anda sadece 1 thread calistirabilir.
	public synchronized void threadSync() {
		count++;

	}

	public void runThreads() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 5000; i++) {
					threadSync();

				}
				System.out.println("thread1 is over");
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 5000; i++) {
					threadSync();
				}
				System.out.println("thread2 is over");
			}
		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count: " + count);

	}

	public static void main(String[] args) {

		ThreadSafeMain main = new ThreadSafeMain();

		main.runThreads();
	}
}
