package com.ayseozcan;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Stock1 {

	Random random = new Random();
	// icideki multi locklar sayesinde thread-safe bir yapidir!!
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(200); // capacity

	public void produce() {

		while (true) {
			Integer val = random.nextInt(1000);

			try {
				queue.put(val);
				System.out.println("mal ekleniyor" + val);
				System.out.println("stok guncel size: " + queue.size());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void consume() {

		while (true) {

			try {
				Thread.sleep(3000);
				Integer val1;
				val1 = queue.take();
				System.out.println("----stoktan mal eksiliyor" + val1);
				System.out.println("stok guncel size: " + queue.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
