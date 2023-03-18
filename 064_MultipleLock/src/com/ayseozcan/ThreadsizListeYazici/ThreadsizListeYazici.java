package com.ayseozcan.ThreadsizListeYazici;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsizListeYazici {

	ArrayList<Integer> liste1 = new ArrayList<>();
	ArrayList<Integer> liste2 = new ArrayList<>();
	
	Random random = new Random();
	
	public void listDegerEkle() {
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		liste1.add(random.nextInt(100));
	}
	
	public void list2DegerEkle() {
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	liste2.add(random.nextInt(100));
}
	
	public void listelereDegerEkle() {
		for (int i = 0; i < 1000; i++) {
			listDegerEkle();
			list2DegerEkle();
		}
		System.out.println("liste1 size : " + liste1.size() + " " + "liste2 size :" + liste2.size());
	}
}
