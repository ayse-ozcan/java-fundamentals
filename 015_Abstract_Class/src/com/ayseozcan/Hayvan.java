package com.ayseozcan;

public abstract class Hayvan {
	
	private String ad;
	private int kilosu;
	private int uzunluk;
	
	public Hayvan() {
		
	}
	
	
	public Hayvan(String ad, int kilosu, int uzunluk) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunluk = uzunluk;
	}


	//abstract metodlar yalnizca abstract siniflarda yazilabilir
	public abstract void sesCikar();
		//abstract metodlar implementasyon icermez. Sadece metod tanimi yazilir.
		//abstract yapilan metodlar mutlaka alt siniflarda implement edilmelidir. / override edilmeli
	
	public abstract void yemekYe();
	
	
	
	public String getAd() {
		return ad;
	}
	
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
	public int getKilosu() {
		return kilosu;
	}
	
	
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	
	
	public int getUzunluk() {
		return uzunluk;
	}
	
	
	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}


	@Override
	public String toString() {
		return "Hayvan [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunluk()=" + getUzunluk() + "]";
	}


	
	

}
