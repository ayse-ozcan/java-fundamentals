package com.ayseozcan;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorOrnek3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("seda");
		list.add("ece");
		list.add("efe");
		System.out.println(list);

		System.out.println("listeyi bastan sona gezmek icin");

		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("listeyi sondan basa gezelim");
		//
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
