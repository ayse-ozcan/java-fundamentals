package com.ayseozcan;

public class Kitap {
	
	//static degisken
	public static final String tur = "Kitap";
	
	//class uye degiskenleri
	public String ad;
	public int sayfaSayisi;
	public String yazarAdi;
	public int stokMiktari;
	
	public String kitapBilgileriniGetir() {
		
		String kitapBilgileri = "ad: " + ad + " yazar: " + yazarAdi + " sayfa sayisi: " + sayfaSayisi + " stok " + stokMiktari +
				" tur: " + Kitap.tur;
		return kitapBilgileri;
	}
}
