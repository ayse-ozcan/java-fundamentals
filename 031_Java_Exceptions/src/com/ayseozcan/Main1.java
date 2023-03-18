package com.ayseozcan;

import java.util.Scanner;

public class Main1 {
	
	/*
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	*/

	public static void main(String[] args) {

		//1.Bolum
		//int y = 25 / 0;
		
		try {
			int y = 25 / 0;
		} catch (Exception e) {
			System.out.println("sifira bolme hatasi");
		}
		try {
			int y = 25 / 0;
		} catch (ArithmeticException e) {
			System.out.println("sifira bolme hatasi");
		}
		
		//2.Bolum
		System.out.println("**********");
		

		int[] arr = {1, 2, 3, 4};
		try {
			System.out.println(arr[4]);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ARRAY in disina cikilmasi hatasi");
			e.printStackTrace();
			String logaYazilacakMesaj = e.toString();
			System.out.println(logaYazilacakMesaj);
		}
		System.out.println("hoscakalin");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("bolen giriniz");
		int bolen = scanner.nextInt();
		
		try {
			int sayi = 25 / bolen;
			int[] array = {1, 2, 3, 4};
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayin sinirlari disina cikiliyor!");
		}catch (ArithmeticException e) {
			System.out.println("0 a bolme hatasi!");
		}catch (Exception e) {
			System.out.println("tahmin edilemeyen bir hata olustu!");
			e.printStackTrace();
		}
		System.out.println("bay");
	}
	

}
