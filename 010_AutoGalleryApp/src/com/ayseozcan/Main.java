package com.ayseozcan;

public class Main {
	public static void main(String[] args) {
		
		//1. otogaleri
		OtoGaleri kardeslerOtoGaleri = new OtoGaleri("Kardesler Oto Galeri", 5);

		Otomobil otomobil1 = new Otomobil("Opel", " Corsa", 2018, 124555, new Motor(1000, "D23424", 7), 40);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);

		Otomobil otomobil2 = new Otomobil("Opel", " Corsa", 2018, 12325, new Motor(1200, "GSD256", 8), 40);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil2);

		Otomobil otomobil3 = new Otomobil("BMW", " Corsa", 2016, 124655, new Motor(1300, "DS4256", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil3);

		Otomobil otomobil4 = new Otomobil("Astra", " Corsa", 2017, 112555, new Motor(1400, "GF326", 5), 40);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil4);

		Otomobil otomobil5 = new Otomobil("Opel", " Audi", 2020, 189555, new Motor(1500, "GS4656", 4), 40);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil5);

		kardeslerOtoGaleri.galeridekiOtomobillerListesi();
		
		//2. otogaleri
		OtoGaleri galeriSuperCar = new OtoGaleri("Galeri SuperCar", 100);
		
		Otomobil otomobil7 = new Otomobil ("Fiat", " Corsa", 2018, 12325, new Motor(1300, "GTR256", 10), 45);
		Otomobil otomobil8 = new Otomobil ("Fiat", " linea", 2018, 12325, new Motor(1200, "GSD256", 8), 50);
		
		galeriSuperCar.galeriyeOtomobilEkle(otomobil7);
		galeriSuperCar.galeridekiOtomobillerListesi();
		galeriSuperCar.galeriyeOtomobilEkle(otomobil8);
		galeriSuperCar.galeridekiOtomobillerListesi();
		
		//findCount
		System.out.println();
		System.out.println(kardeslerOtoGaleri.getGaleriAdi() + "galerideki BMW sayisi: " + kardeslerOtoGaleri.findCount("BMW"));
		System.out.println(galeriSuperCar.getGaleriAdi() + "galerideki BMW sayisi : " + galeriSuperCar.findCount("BMW"));
		
		System.out.println("***********************");
		
		//search
		
		
		System.out.println();
		System.out.println("\n****Search Sonuclari****\n");
		
		Otomobil[] sonuclarDizisi = kardeslerOtoGaleri.search("Audi");
		for(Otomobil oto : sonuclarDizisi) {
			System.out.println(oto);
		}
		
		System.out.println("\n****Search2 Sonuclari****\n");
		
		Otomobil[] sonuclarDizisi2 = galeriSuperCar.search("Fiat");
		for(Otomobil oto : sonuclarDizisi2) {
		
			System.out.println(oto);
		}
		
		System.out.println("\n\n silme islemi \n\n");
		galeriSuperCar.galeridenOtomobilSil(1);
		galeriSuperCar.galeridekiOtomobillerListesi();
	}
}

