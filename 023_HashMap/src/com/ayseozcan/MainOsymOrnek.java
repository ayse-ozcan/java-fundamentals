package com.ayseozcan;

import java.util.HashMap;

public class MainOsymOrnek {

	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci("kagan", "sdasd", 87, 56, 65);
		Ogrenci ogrenci2 = new Ogrenci("fatos", "ggdgg", 50, 59, 70);
		Ogrenci ogrenci3 = new Ogrenci("osman", "sccccd", 90, 40, 36);
		Ogrenci ogrenci4 = new Ogrenci("cafer", "saaaad", 95, 15, 89);

		// key : Integer (tc) --> value : ogrenci sinifindan olusturulan nesneler
		// new dan sonra <> arasina int ve ogr yazmak zorunda degiliz.java 8 den sonra
		// degisti.
		HashMap<Integer, Ogrenci> hashMap = new HashMap<Integer, Ogrenci>();
		hashMap.put(145565, ogrenci1);
		hashMap.put(324234, ogrenci2);
		hashMap.put(546456, ogrenci3);
		hashMap.put(454333, ogrenci4);
		
		// Sorgu yaziyoruz
		// 145565 nolu ogrenciyi sorguluyoruz
		Ogrenci sonuc = hashMap.get(145565);
		System.out.println(sonuc);
		
		sonuc = hashMap.get(324234);
		System.out.println(sonuc);
		
		

	}

}
