package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		
		Kitap kitap1 = new Kitap(); // new memory de yer tahsis etmek icin.
		
		kitap1.ad = "Ince Memed";
		kitap1.sayfaSayisi = 450;
		kitap1.yazarAdi = "Yasar Kemal";
		kitap1.stokMiktari = 500;
		kitap1.sayfaSayisi = 452;
		
		System.out.println(kitap1.ad + " " + kitap1.sayfaSayisi + " " + kitap1.yazarAdi );
		
		System.out.println();
		Kitap kitap2 = new Kitap();
		
		kitap2.ad = "Kasagi";
		kitap2.yazarAdi = "Omer Seyfettin";
		kitap2.sayfaSayisi = 50;
		kitap2.stokMiktari = 80;
		System.out.println(kitap2.kitapBilgileriniGetir());
		System.out.println(kitap1.kitapBilgileriniGetir());
		
		System.out.println(Kitap.tur);
		
		//puzzle nesneleri
		
		Puzzle ravensBurgerEyfel = new Puzzle();
		ravensBurgerEyfel.adi = "Eyfel Kulesi";
		ravensBurgerEyfel.marka = "RavensBurger";
		ravensBurgerEyfel.parcaSayisi = 1000;
		ravensBurgerEyfel.stokMiktari = 200;
		
		System.out.println(ravensBurgerEyfel.puzzleBilgileriniGetir());
		
		Kitap kitap3;
		kitap3 = kitap2;
		System.out.println("kitap3: " + kitap3.ad);
		
		kitap3.sayfaSayisi = 75;
		System.out.println(kitap3.sayfaSayisi);
		
		System.out.println(kitap2.sayfaSayisi);
		
		kitap2 = new Kitap();
		kitap2.ad = "80 gunde devrialem";
		kitap2.yazarAdi = "Jules Verne";
		kitap2.sayfaSayisi = 150;
		kitap2.stokMiktari = 280;
		
		System.out.println(kitap2.kitapBilgileriniGetir());
		
		
	}
}
