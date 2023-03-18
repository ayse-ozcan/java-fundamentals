package com.ayseozcan;

public class Ogrenci {

	private static IletisimBilgileri iletisimBilgileri;
	public int ogrenciNo;
	public String ad;
	public String soyad;
	public IletisimBilgileri iletisimBilg;
	
	
	

	@Override
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + ", ad=" + ad + ", soyad=" + soyad + ", iletisimBilg=" + iletisimBilg
				+ "]"; //iletisim bilgileri sinifinda iletisimbilgisi de toString altinda yazili old. icin cagirabildik
	}




	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.ogrenciNo = 100;
		ogrenci1.ad = "Kagan";
		ogrenci1.soyad = "Kaya";
		
		ogrenci1.iletisimBilg = new IletisimBilgileri();
		ogrenci1.iletisimBilg.adres = "dasdasdasd";
		ogrenci1.iletisimBilg.tel = 545465464L;
		
		System.out.println(ogrenci1.toString());
		
		System.out.println(ogrenci1);
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ogrenciNo = 100;
		ogrenci2.ad = "Zeynep";
		ogrenci2.soyad = "oz";
		
		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.ogrenciNo = 100;
		ogrenci3.ad = "Bartu";
		ogrenci3.soyad = "Ak";
		
		
		
		Ogrenci [] diziOgrenci = new Ogrenci[1];
		diziOgrenci [0] = ogrenci1; 
		diziOgrenci [1] = ogrenci2; 
		diziOgrenci [2] = ogrenci3; 
		
		diziOgrenci [2].iletisimBilg = new IletisimBilgileri();
		
		
		System.out.println("\n***Ogrenci Listesi***");
		for (Ogrenci ogr : diziOgrenci) {
			System.out.println(ogr);
			
		}
		
	
	}
	
	}

