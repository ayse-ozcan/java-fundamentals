package com.ayseozcan;

import java.util.HashMap;

public class Soru1 {

	public static void harfSayisiniBul(String metin) {
		// hashMap kullanabilirsiniz
		// key --> karakter
		// value --> karakterin tekrar sayisi (count)

		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < metin.length(); i++) {
			char ch = metin.charAt(i);

			if (hashMap.containsKey(ch)) {// karakter hashmap de mevcutsa

				hashMap.put(ch, hashMap.get(ch) + 1);

			} else { // karakter hashmap de mevcut degilse

				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);

	}
	
	
	public static void enCokTekrarEdenHarfiBul(String metin) {
		// hashMap kullanabilirsiniz
		// key --> karakter
		// value --> karakterin tekrar sayisi (count)

		HashMap<Character, Integer> hashMap = new HashMap<>();
		char enCokTekrarEdenKarakter = 0;
		int max = 0;
		

		for (int i = 0; i < metin.length(); i++) {
			char ch = metin.charAt(i);

			if (hashMap.containsKey(ch)) {// karakter hashmap de mevcutsa

				int tekrarSayisi = hashMap.get(ch) + 1;
				if(tekrarSayisi > max) {
					enCokTekrarEdenKarakter = ch;
					max = tekrarSayisi;
					
				}
				
				hashMap.put(ch, hashMap.get(ch) + 1);

			} else { // karakter hashmap de mevcut degilse

				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
		System.out.println("enCokTekrarEdenKarakter: " + enCokTekrarEdenKarakter + " ,tekrar sayisi: " + max);
		
	}

	public static void main(String[] args) {
		// static bir metod yazin
		// bir string icindeki karakterlerin sayisini bulan ve ekrana yazdiran bir metod
		// yazin

		String metin = "Herkese Merhaba Iyi calismalar";
		// h: 1 e:1 l:2 ...
		//Soru1.harfSayisiniBul(metin);
		
		//en cok tekrar eden harfi bulunuz ve tekrar sayisini yazdiriniz
		
		Soru1.enCokTekrarEdenHarfiBul(metin);
	}

}
