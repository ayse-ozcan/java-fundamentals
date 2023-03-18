package com.ayseozcan;

public class ForEach {

	public static void main(String[] args) {
		int [] dizi = { 1, 24, 35, 55, 78, 83, 39 };
		
		for(int sayi : dizi) {
			System.out.print(sayi + " ");
		}
		
		System.out.println();
		
		String name = "";
		
		String [] isimlerDizi = { "Ali", "Veli", "Osman", "Zeynep" };
		
		for(String isim : isimlerDizi) {
			System.out.println(isim);
			name = isim;
		}
		System.out.println("name: " + name);
		
		int z;
		//int y = z * 2; Hata verir z yi initialize etmeniz gerekir. ++Ilk deger atamalisin.
	}

}
