package com.ayseozcan;


public class Anahtar {
	
	public static final int uzunluk = 10;
	
	//ozellik / uye degisken
	
	public String renk;
	public int no;
	public String ad;
	
	//static uye method
	
	public static void uzunluguEkranaYaz() {
		
		System.out.println(Anahtar.uzunluk);
		
		//static metodlar icinde static olmayan degiskenler kullanilmaz
			
	}
	//nonStatic metod
	public void bilgileriEkranaYaz() {
		System.out.println("no: "+ no + "ad: " + ad + "renk: " + renk);
		
		
		
		
	}
	
	
	

}
