package com.ayseozcan;

public class Main {

	/// POLYMORPHISM (ÇOK BİÇİMLİLİK)
	//
	// Bir nesne referansının (değişkenin) farklı nesneler gibi davranabilmesidir.

	public static void yeniMaasiHesapla(Personel personel) {
		System.out.println(personel.getZamKatsayisi() * personel.getMaas());
	}
	
	//Polymorphism de sadece ata class in metodlari polimorfik kullanilabilir. 
	//personel.getuzmanlikAlani() --> kullanilamaz cunku personel sinifinda boyle bir metod yok
	
	/*
	 * public static void yeniMaasiHesapla(Muhendis muhendis) {
	 * System.out.println(muhendis.getZamKatsayisi() * muhendis.getMaas()); }
	 * 
	 * public static void yeniMaasiHesapla(Sekreter sekreter) {
	 * System.out.println(sekreter.getZamKatsayisi() * sekreter.getMaas()); }
	 * 
	 * public static void yeniMaasiHesapla(Mudur mudur) {
	 * System.out.println(mudur.getZamKatsayisi() * mudur.getMaas()); }
	 * 
	 * public static void yeniMaasiHesapla(DaireBaskani daireBaskani) {
	 * System.out.println(daireBaskani.getZamKatsayisi() * daireBaskani.getMaas());
	 * }
	 * 
	 * public static void yeniMaasiHesapla(IdariMemur idariMemur) {
	 * System.out.println(idariMemur.getZamKatsayisi() * idariMemur.getMaas()); }
	 */

	public static void main(String[] args) {

		Muhendis m = new Muhendis("Ali", "Emre", "1111", 42, 32000, 3, 5324445555L, "Yazılım Müh.");
		Main.yeniMaasiHesapla(m);

		Sekreter s = new Sekreter("Zeynep", "Taş", "2222", 25, 12000,7,53222234L, 111, 112);
		Main.yeniMaasiHesapla(s);
		
		GenelMudur gm = new GenelMudur("kazim", "kaya", "13213", 52, 90000, 1, 564654654L);
		//Main.yeniMaasiHesapla(gm); calismaz cunku GenelMudur sinifi Personel sinifindan turetilmemistir.(extend edilmemis)
		
		

	}

}
