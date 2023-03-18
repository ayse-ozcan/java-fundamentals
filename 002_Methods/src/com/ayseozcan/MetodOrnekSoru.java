package com.ayseozcan;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnekSoru {
	
	
	private static void randomNumber7() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("lutfen ust limit giriniz:");
		int ustLimit = scanner.nextInt();
		
		Random random= new Random();
		for (int i = 0; i < 10; i++) {
			int result=1;
			do {
				result=random.nextInt(ustLimit);
				
			} while (result%7 != 0);
			System.out.println("sayi"+ i + ":" + result);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		//rastgele 7nin kati olan 10 tane tamsayi ureten ve ekrana yazdiran bir metod yaziniz
		//ust limiti parametre olarak kullanicidan alin
		randomNumber7();
	}
}
