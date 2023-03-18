package com.ayseozcan;

import java.util.Scanner;

public class ThrowIleExceptionFirlatma {

	
	//hiz degeri 120 den buyukse exception firlatacagiz
	public static void hizKontrol(int hiz) {
		if (hiz > 120) {
			throw new ArithmeticException();

		} else {
			System.out.println("iyi yolculuklar");
			
		}
	}
	//Throw ile atilan exception larda try catch yazmayabilirsiniz ama bu durumda exception yenildiginde 
	//program coker.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hizinizi giriniz: ");
		int hiz = scanner.nextInt();
		
		try {
			hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("cok hizli gidiyorsun lutfen hizini azalt");
		}

	}

}
