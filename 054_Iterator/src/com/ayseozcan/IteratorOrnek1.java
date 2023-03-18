package com.ayseozcan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOrnek1 {

	public static void main(String[] args) {
		// Java Iterotor collection siniflari icindeki elemanlar arasinda gezinmemizi
		// saglar
		// Java Iterotor collection siniflari Collection elemanlarini iteration
		// sirasinda remove edebilirler

		
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(5);
		listInteger.add(10);
		listInteger.add(4);
		
		Iterator<Integer> iterator = listInteger.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
