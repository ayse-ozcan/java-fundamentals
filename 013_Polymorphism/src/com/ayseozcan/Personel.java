package com.ayseozcan;

//Ust Sinif/ Ata Sinif/ Parent Sinif /Super class

public class Personel {
	
	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	
	//consructor
	
	public Personel() {
		
		//System.out.println("Personel sinifinin 1 nolu constructor i cagirildi");
	}
	
	
	//method overloading
	public Personel(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tcKimlik = tcKimlik;
		this.yas = yas;
		this.maas = maas;
		this.kidemBilgisi = kidemBilgisi;
		this.cepTelNo = cepTelNo;
	}

	
	public int getZamKatsayisi() {
		return 1;
		
	}


	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getTcKimlik() {
		return tcKimlik;
	}
	
	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public int getMaas() {
		return maas;
	}
	
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	public int getKidemBilgisi() {
		return kidemBilgisi;
	}
	
	public void setKidemBilgisi(int kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
	}
	
	public long getCepTelNo() {
		return cepTelNo;
	}
	
	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}
	
	

}
