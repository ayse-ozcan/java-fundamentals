package com.ayseozcan;

//Ust Sinif/ Ata Sinif/ Parent Sinif

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
		
		System.out.println("Personel sinifinin 1 nolu constructor i cagirildi");
	}
	
	public Personel(String s, int y) {
		
		System.out.println("Personel sinifinin 2 nolu constructor i cagirildi");
		
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
