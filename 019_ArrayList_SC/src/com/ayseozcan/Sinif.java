package com.ayseozcan;

import java.util.ArrayList;

public class Sinif {
	
	private String sinifAdi;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrencilerArrayList;
	
	
	public Sinif(String sinifAdi, String lokasyon, ArrayList<Ogrenci> ogrencilerArrayList) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = ogrencilerArrayList;
	}
	

	
	public Sinif(String sinifAdi, String lokasyon) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = new ArrayList<>();
		
	}

	public void siniftanOgrenciCikar(Ogrenci ogrenci) {
		
		this.ogrencilerArrayList.remove(ogrenci);
	}
	
	
	//okulNo parametresine gore ogrenci cikarilmasi
	public void siniftanOgrenciCikar(int okulNo) {
		Ogrenci silinecekOgrenci = null;
		
		for(Ogrenci ogrenci : this.ogrencilerArrayList) {
			
			if(ogrenci.getOkulNo() == okulNo) {
				silinecekOgrenci = ogrenci;
				break;
			}
		}
		
		if(silinecekOgrenci != null) {
			this.ogrencilerArrayList.remove(silinecekOgrenci);
			
		}else {
			System.out.println(okulNo + "  numarali ogrenci bu sinifta bulunamadi!");
		}
	}


	public void sinifaOgrenciEkle(Ogrenci ogrenci) {
		
		this.ogrencilerArrayList.add(ogrenci);
		
		
	}
	
	public void sinifaOgrenciEkle(String ad, String soyad, int okulNo, int notOrtalamasi ) {
		
		if(ad.length()<2 || soyad.length()<2) {
			System.out.println("ad ve soyad 2 karakterdeb kucuk olamaz!");
		}else {
			this.ogrencilerArrayList.add(new Ogrenci ( ad, soyad,  okulNo, notOrtalamasi));
		}
	}
	
	public void siniftakiOgrenciListesiniYazdir() {
		
		System.out.println("\n***" + this.sinifAdi + " sinifindaki ogrenci listesi***\n");
		for(Ogrenci ogrenci : this.ogrencilerArrayList) {
			System.out.println(ogrenci);
		}
		
	}


	public String getSinifAdi() {
		return sinifAdi;
	}


	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}


	public String getLokasyon() {
		return lokasyon;
	}


	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}



	public ArrayList<Ogrenci> getOgrencilerArrayList() {
		return ogrencilerArrayList;
	}



	public void setOgrencilerArrayList(ArrayList<Ogrenci> ogrencilerArrayList) {
		this.ogrencilerArrayList = ogrencilerArrayList;
	}
	
	
	
	
	

}
