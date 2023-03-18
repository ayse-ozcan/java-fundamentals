package com.ayseozcan;

public class VarArgsKullanimi {
	
	public static void toplaVarArgs(int... sayilar) {
		
		int toplam = 0; //parametre kisminda yazan sayilar bir dizi gibi davranir.
		
		for(int i = 0; i<sayilar.length; i++) {
			toplam += sayilar[i];
			
		}
		System.out.println("toplam " + toplam);
		
		//for each ile yapali
		
		int toplamForEach = 0;
		
		for(int x : sayilar) {
			toplamForEach += x;
			
			
		}
		System.out.println(toplamForEach);
		
		
	}
	
	public static void ekranaYazdir(String... isimler) {
		for(String isim: isimler) {
			System.out.println(isim);
		}
	}
	
	public static void main(String[] args) {

		toplaVarArgs(1, 2, 3, 5, 7);
		ekranaYazdir("Kagan, Veli");
	}

}
