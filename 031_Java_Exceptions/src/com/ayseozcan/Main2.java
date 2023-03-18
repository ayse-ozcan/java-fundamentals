package com.ayseozcan;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("bolen giriniz");
		int bolen = scanner.nextInt();
		
		try {
			int sayi = 25 / bolen;
			int[] array = {1, 2, 3, 4};
			System.out.println(array[7]);
	
		}catch (Exception e) {
			System.out.println("tahmin edilemeyen bir hata olustu!");
			System.out.println(e.getMessage());
		}
		System.out.println("bay");
	}

	}


