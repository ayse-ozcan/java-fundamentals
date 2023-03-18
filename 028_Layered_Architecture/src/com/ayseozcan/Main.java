package com.ayseozcan;

import java.util.Scanner;

import com.ayseozcan.controller.OgrenciController;
import com.ayseozcan.controller.OgretmenController;

public class Main {

	public static void main(String[] args) {

		OgrenciController ogrenciController = new OgrenciController();
		OgretmenController ogretmenController = new OgretmenController();
		
		
		int secim = 0;
		do {
			System.out.println("\n*****OKUL BILGI SISTEMINE HOSGELDINIZ*****\n");
			System.out.println("1- Ogrenci ekleme");
			System.out.println("2- Ogrenci silme");
			System.out.println("3- Ogrenci bilgileri guncelleme");
			System.out.println("4- Ogrenci arama");
			System.out.println("5- Ogrenci listesini goruntuleme");

			System.out.println("6- Ogretmen ekleme");
			System.out.println("7- Ogretmen silme");
			System.out.println("8- Ogretmen bilgileri guncelleme");
			System.out.println("9- Ogretmen arama");
			System.out.println("10- Ogretmen listesini goruntuleme");
			System.out.println("11- Cikis");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Seciminiz: ");
			secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				ogrenciController.ogrenciEkleme();
				break;
				
			case 2:
				ogrenciController.ogrenciSil();
				
				break;
			case 3:
				ogrenciController.ogrenciGuncelle();
				break;
			case 4:
				ogrenciController.ogrenciBul();
				break;
			case 5:
				ogrenciController.ogrenciListesiniGoster();
				break;
			case 6:
				ogretmenController.ogretmenEkleme();
				break;
			case 7:
				ogretmenController.ogretmenSil();
				break;
			case 8:
				ogretmenController.ogretmenGuncelle();
				break;
			case 9:
				ogretmenController.ogretmenBul();
				break;
			case 10:
				ogretmenController.ogretmenListesiniGoster();
				break;
			
			default:
				break;
			}

		} while (secim != 11);

	}

}
