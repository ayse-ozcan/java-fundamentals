package com.ayseozcan;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Emre", 450, 0);
		Ogrenci ogrenci2 = new Ogrenci("ayse", "yaz", 300, 0);
		Ogrenci ogrenci3 = new Ogrenci("zeynep", "kis", 530, 0);
		Ogrenci ogrenci4 = new Ogrenci("fatma", "ece", 369, 0);
		
		Sinif sinif1 = new Sinif("1A", " zemin kat 101 no lu oda", new ArrayList<Ogrenci>());
		
		Sinif sinif2 = new Sinif("1b", " zemin kat 102 no lu oda");
		Ogrenci ogrenci5 = new Ogrenci("Kagan", "efe", 529, 0);
		sinif2.sinifaOgrenciEkle(ogrenci5);
		
		
		Sinif sinif3 = new Sinif("1c", " zemin kat 103 no lu oda");
		Ogrenci ogrenci6= new Ogrenci("cem", "ege", 566, 0);
		Ogrenci ogrenci7 = new Ogrenci("oguz", "eren", 896, 0);
		Ogrenci ogrenci8 = new Ogrenci("mete", "han", 542, 0);
		sinif3.sinifaOgrenciEkle(ogrenci6);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(new Ogrenci("safak", "tas", 841, 0));
		System.out.println("++++++++++++");
		sinif3.siniftanOgrenciCikar(566);
		sinif3.siniftakiOgrenciListesiniYazdir();
		System.out.println("++++++++++++");
		//okul nesnesi olusturuyoruz
		
		Okul okul1 = new Okul("guven ilkokulu", "cankaya ankara");
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif2);
		okul1.sinifEkle(sinif3);
		okul1.siniflariYazdir();
		
//		okul1.okuldanSinifCikar("1c");
//		okul1.siniflariYazdir();
		
		okul1.okuldakiOgrencileriYazdir();
		okul1.okuldanSinifCikarIterators("1a");
		okul1.okuldakiOgrencileriYazdir();
		
		//1a sinifina ogrenci ekleyelim
		Sinif sinif = okul1.getSinif("1a");
		if (sinif != null) {
			sinif.sinifaOgrenciEkle(ogrenci5);
		}else {
			System.out.println("sinif bulunamadi");
		}
		okul1.okuldakiOgrencileriYazdir();
	}

}
