package com.ayseozcan;

import java.util.Scanner;

public class MetodOrnekSoru4 {
	
	private static long alanHesapla(long kisaKenar, long uzunKenar) {
		
		return(kisaKenar * uzunKenar);
		
	}
	
	private static int kareAlanHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kenar uzunlugu:");
		int kenar = scanner.nextInt();
		return(kenar*kenar);
		
	}

	public static void main(String[] args) {
		// dikdortgenin alanini hesaplayin
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("uzun kenari giriniz: ");
//		long uzunKenar = scanner.nextLong();
//		System.out.println("kisa kenari giriniz: ");
//		long kisaKenar = scanner.nextLong();
//		System.out.println("Alan = " + alanHesapla(kisaKenar, uzunKenar));
//		System.out.println("Alan = " + kareAlanHesapla());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kac tane kare alani dizide tutmak istersiniz? ");
		int n = scanner.nextInt();
		System.out.println();
		
		int[] kenarAlanlariDizi = new int [n];
		
		for (int i = 0; i < n; i++) {
			kenarAlanlariDizi[i] = kareAlanHesapla();
			System.out.println(i + ". kare alani:" + kenarAlanlariDizi[i]);
		}
	}

}
