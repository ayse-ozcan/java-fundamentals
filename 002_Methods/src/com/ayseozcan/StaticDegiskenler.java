package com.ayseozcan;

public class StaticDegiskenler {
	
	public static final int DUNYANIN_YARICAPI = 6371;
	public static final double PI = 3.14;
	public static int aktifKullaniciSayisi= 0;
	
	

	public static void main(String[] args) {
		// Siniflarin static degiskenleri
		
		System.out.println("Aktif kullanici sayisi:" + StaticDegiskenler.aktifKullaniciSayisi);
		StaticDegiskenler.aktifKullaniciSayisi++;
		System.out.println("Aktif kullanici sayisi:" + StaticDegiskenler.aktifKullaniciSayisi);
		

		//scope
		//Local degiskenler yalnizca tanimlandiktan sonra kullanilabilir
		
		

	}

}
