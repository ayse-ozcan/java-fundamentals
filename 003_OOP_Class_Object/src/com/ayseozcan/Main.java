package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		
		// ilk anahtar nesnesi
		
		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk = "mavi";
		anahtar1.no = 10;
		anahtar1.ad = "Benim anahtarim";
		
		System.out.println("ad: " + anahtar1.ad + " renk: " + anahtar1.renk + " no: " + anahtar1.no + " uzunluk: " + Anahtar.uzunluk);
		
		//2. bir anahtar nesnesi olusturalim
		
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk = "kirmizi";
		anahtar2.no = 12;
		anahtar2.ad = "Kardesimin anahtari";
		
		System.out.println("ad: " + anahtar2.ad + " renk: " + anahtar2.renk + " no: " + anahtar2.no + " uzunluk: " + Anahtar.uzunluk);
		
		
		//3.anahtar
		Anahtar anahtar3= new Anahtar();
		anahtar3.renk = "yesil";
		anahtar3.no = 15;
		anahtar3.ad = "deponun anahtari";
		
		System.out.println("ad: " + anahtar3.ad + " renk: " + anahtar3.renk + " no: " + anahtar3.no + " uzunluk: " + Anahtar.uzunluk);
		
		
		
		System.out.println("\n***\n");
		// static bir metodu kullanirken classname.metod
		Anahtar.uzunluguEkranaYaz();
		
		//nonstatic de nesneadi.metod yazilir
		anahtar1.bilgileriEkranaYaz();
		anahtar2.bilgileriEkranaYaz();
		
		// nesnelerden olusan diziler
		
		int[] sayilarDizisi = { 2, 4, 9, 12 };
		System.out.println(sayilarDizisi[0]);
		for(int i =0; i < sayilarDizisi.length; i++) {
			System.out.println(sayilarDizisi[i]);
		}
		
		Anahtar [] anahtarDizisi = {anahtar1, anahtar2, anahtar3};
		for(int i =0; i < anahtarDizisi.length; i++) {
			System.out.println(anahtarDizisi[i].ad);
			
			
		}
		System.out.println();
		for(int i =0; i < anahtarDizisi.length; i++) {
			anahtarDizisi[i].bilgileriEkranaYaz();
			
		
		}
		
		System.out.println();
		for(Anahtar anahtar : anahtarDizisi) {
			anahtar.bilgileriEkranaYaz();
		}
		
		
		
	}

}
