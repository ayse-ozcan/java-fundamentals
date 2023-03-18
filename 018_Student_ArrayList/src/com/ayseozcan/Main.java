package com.ayseozcan;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Emre", 450, 0);
		Ogrenci ogrenci2 = new Ogrenci("ayse", "yaz", 300, 0);
		Ogrenci ogrenci3 = new Ogrenci("zeynep", "kis", 530, 0);
		Ogrenci ogrenci4 = new Ogrenci("fatma", "ece", 369, 0);
		
		Sinif sinif1 = new Sinif("1A", "zemin kat 101 no lu oda", new ArrayList<Ogrenci>());
		
		
		sinif1.sinifaOgrenciEkle(ogrenci1);
		sinif1.sinifaOgrenciEkle(ogrenci2);
		sinif1.sinifaOgrenciEkle(ogrenci3);
		sinif1.sinifaOgrenciEkle(ogrenci4);
		
		sinif1.siniftakiOgrenciListesiniYazdir();
		
		
		Sinif sinif2 = new Sinif("1b", "asdas");
		Ogrenci ogrenci5 = new Ogrenci("Kagan", "efe", 529, 0);
		sinif2.sinifaOgrenciEkle(ogrenci5);
		sinif2.siniftakiOgrenciListesiniYazdir();
		
		Sinif sinif3 = new Sinif("1c", "assdf");
		Ogrenci ogrenci6= new Ogrenci("cem", "ege", 566, 0);
		Ogrenci ogrenci7 = new Ogrenci("oguz", "eren", 896, 0);
		Ogrenci ogrenci8 = new Ogrenci("mete", "han", 542, 0);
		sinif3.sinifaOgrenciEkle(ogrenci6);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(new Ogrenci("safak", "tas", 841, 0));
	
		sinif3.siniftakiOgrenciListesiniYazdir();
		
		sinif3.siniftanOgrenciCikar(ogrenci8);
		sinif3.siniftakiOgrenciListesiniYazdir();
		sinif3.siniftanOgrenciCikar(542);
		sinif3.siniftakiOgrenciListesiniYazdir();
		
		
	}

}
