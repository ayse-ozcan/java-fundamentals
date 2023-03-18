package com.ayseozcan;

public class MetodOrnekleri2 {
	
	private static int diziTopla(int[] dizi) {
		int toplam=0;
		for (int i = 0; i < dizi.length; i++) {
			//toplam= toplam + dizi[i];
			toplam+=dizi[i];
			
		}
		return toplam;
		
	}
	private static void arrayIlkElemaniDegistir(int[] dizi) {
		if (dizi.length !=0) {
			dizi[0]=100;
		}
	}
	
	private static void test(int sayi) {
		sayi=200;
	}
	
	private static int test2(int sayi) {
		sayi=300;
		return sayi;
	}

	public static void main(String[] args) {
		//bir tamsayi dizisi icindeki sayilari toplayip return etsin
		
		int[] array1 = {5, 10, 15, 20};
		System.out.println(diziTopla(array1));
		
		int[] array2 = {8};
		System.out.println(diziTopla(array2));
		
		arrayIlkElemaniDegistir(array1);
		System.out.println(array1[0]);
		
		int sayi=1;
		test(sayi);
		System.out.println(sayi);
		
		System.out.println(test2(sayi));
		sayi=test2(sayi);
		System.out.println(sayi);
	}

}
