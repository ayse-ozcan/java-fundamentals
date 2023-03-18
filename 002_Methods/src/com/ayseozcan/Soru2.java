package com.ayseozcan;



public class Soru2 {
	
	
	public static int metod1 () {
		
		int sayac = 0;
		
		for (int i = 34; i<=97; i++) {
			if(i % 3 ==0 || i % 5 ==0) {
				System.out.println(i + "");
				sayac++;
			
		}		
			
		}
		System.out.println();
		return sayac;
	}
	
	public static int [] metod2 (int sayi1, int sayi2) {
		
		int sayac = 0;
		int toplam = 0;
		
		for (int i = sayi1; i<=sayi2; i++) {
			if(i % 3 ==0 && i % 5 ==0) {
				System.out.println(i + "");
				sayac++;
				toplam += i; //toplam = toplam + i;
			
		}		
			
		}
		System.out.println();
		int[] sonuclarDizisi = new int[2];
		sonuclarDizisi [0] = sayac;
		sonuclarDizisi [1] = toplam;
		
		return sonuclarDizisi;
	}
	
	

	public static void main(String[] args) {
		
		//34 ile 97 arasinda (34 ve 97 dahil) 3 e veya 5 e bolunebilen sayilari yazdiran metod
		//metod bu araliktaki  3 e veya 5 e bolunebilen sayilarin kac tane oldugunu ve toplamini return etsin
		System.out.println( " 34 ile 97 arasinda 3 e veya 5 e bolunebilen sayilarin adedi: " + Soru2.metod1());
		System.out.println("***************************");
		
		int [] dizi;
		dizi = Soru2.metod2(34,97);
		System.out.println("\n soru cevap: ");
		for (int sayi : dizi) {
			System.out.println(sayi);
		}
	}

}
