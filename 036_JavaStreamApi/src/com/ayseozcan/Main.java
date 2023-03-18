package com.ayseozcan;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(new Ogrenci("veli", 100));
		ogrenciler.add(new Ogrenci("cafer", 200));
		ogrenciler.add(new Ogrenci("ewrw", 300));
		ogrenciler.add(new Ogrenci("verwli", 400));

		ogrenciler.stream().forEach(ogr -> System.out.println(ogr));
		System.out.println("***************************************");
		ogrenciler.stream().forEach(ogrenci -> {
			System.out.println("ogrenci bilgisi");
			System.out.println(ogrenci);
		});

		ogrenciler.stream().forEach(ogr -> ogr.sinavNotu());

		// method reference
		ogrenciler.stream().forEach(Ogrenci::sinavNotu);

		// filter metodu
		long id200denBuyukOgrenciSaysisi = ogrenciler.stream().filter(ogrenci -> ogrenci.getId() > 200).count();
		System.out.println("id si 200den buyuk ogrenci sayisi: " + id200denBuyukOgrenciSaysisi);

		// cOLLECT METHODU
		List<Ogrenci> filtrelenmisListe = ogrenciler.stream().filter(ogrenci -> ogrenci.getId() > 200)
				.collect(Collectors.toList());
		filtrelenmisListe.stream().forEach(ogr -> System.out.println(ogr));

		// map() metodu:

		List<Ogrenci> mappedList = ogrenciler.stream().map(ogr -> new Ogrenci(ogr.getAd(), ogr.getId() * 100))
				.collect(Collectors.toList());
		mappedList.stream().forEach(ogr -> System.out.println(ogr));

		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		Map<Integer, String> ogrenciMap = ogrenciler.stream()
				.collect(Collectors.toMap(ogr -> ogr.getId(), ogr -> ogr.getAd()));

		ogrenciMap.forEach((key,value) -> System.out.println(key + "->" + value)); 
		System.out.println(ogrenciMap.containsKey(200));
		System.out.println(ogrenciMap.containsKey(300));
		
		String isim = ogrenciMap.get(400);
		System.out.println(isim);
		
	}

}
