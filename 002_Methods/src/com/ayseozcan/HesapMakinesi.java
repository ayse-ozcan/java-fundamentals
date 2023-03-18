package com.ayseozcan;

import java.util.Scanner;

public class HesapMakinesi {
	
	private static void menuyuGoster() {
		System.out.println("***Hesap Makinesi***");
		System.out.println("1. Toplama");
		System.out.println("2. Cikarma");
		System.out.println("3. Carpma");
		System.out.println("4. Bolme");
		System.out.println("5. Cikis");
	}

	public static void main(String[] args) {
		int secim=0;
		
		do {
			menuyuGoster();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Lutfen seciminizi giriniz (1-5): ");
			secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				System.out.println("Toplama islemi: ");
				System.out.println("Lutfen 1. sayiyi giriniz: ");
				int sayi1 = scanner.nextInt();
				System.out.println("Lutfen 2. sayiyi giriniz: ");
				int sayi2 = scanner.nextInt();
				System.out.println("Sonuc= " + (sayi1 + sayi2));
				break;
				
			case 2:
				System.out.println("Cikarma islemi: ");
				System.out.println("Lutfen 1. sayiyi giriniz: ");
				int sayi3 = scanner.nextInt();
				System.out.println("Lutfen 2. sayiyi giriniz: ");
				int sayi4 = scanner.nextInt();
				System.out.println("Sonuc= " + (sayi3 - sayi4));
				break;
				
			case 3:
				System.out.println("Carpma islemi: ");
				System.out.println("Lutfen 1. sayiyi giriniz: ");
				int sayi5 = scanner.nextInt();
				System.out.println("Lutfen 2. sayiyi giriniz: ");
				int sayi6 = scanner.nextInt();
				System.out.println("Sonuc= " + (sayi5 * sayi6));	
				break;
				
			case 4:
				System.out.println("Bolme islemi: ");
				System.out.println("Lutfen 1. sayiyi giriniz: ");
				int sayi7 = scanner.nextInt();
				System.out.println("Lutfen 2. sayiyi giriniz: ");
				int sayi8 = scanner.nextInt();
				System.out.println("Sonuc= " + (sayi7 / sayi8));
				break;
				
			case 5:
				System.out.println("Hoscakalin");
				
				break;
			default:
				System.out.println("Hatali secim yaptiniz, girdiginiz deger 1-5 araliginda olmali");
				
				break;
		 } 
		}while (secim != 5);	
			
		}
	}

