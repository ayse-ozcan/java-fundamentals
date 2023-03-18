package com.ayseozcan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		list.add("opel");
		list.add("audi");
		list.add("vw");
		list.add("renault");
		System.out.println(list);
		
		//Collections sinifi : bir utility sinifidir.
		Collections.sort(list);
		System.out.println(list);
		
		List<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(new Ogrenci("Berk", 1050));
		ogrenciler.add(new Ogrenci("Gulsu", 345));
		ogrenciler.add(new Ogrenci("Sinem", 1768));
		ogrenciler.add(new Ogrenci("Hivda", 171));
		ogrenciler.add(new Ogrenci("Ahmet", 987));
		
		System.out.println("\n" + ogrenciler);
		//NOT: kendi yazdigimiz metodlari sort metodu ile siralatmak istiyorsak yazdigimiz
		//siniflar comparable interface ini implement etmeli!!
		Collections.sort(ogrenciler);
		System.out.println("\n" + ogrenciler);
		
		//Compare
		Ogrenci ogr1 = new Ogrenci("Kagan", 120);
		Ogrenci ogr2 = new Ogrenci("Veli", 250);
		System.out.println(ogr1.compareTo(ogr2));

	}

}
