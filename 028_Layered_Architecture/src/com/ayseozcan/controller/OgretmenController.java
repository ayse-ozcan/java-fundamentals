package com.ayseozcan.controller;

import java.util.Scanner;

import com.ayseozcan.repository.OgrenciRepository;
import com.ayseozcan.repository.OgretmenRepository;

import com.ayseozcan.repository.entity.Ogretmen;

public class OgretmenController {

	private OgretmenRepository  ogretmenRepository;
	


	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository();
	}
	


	public void ogretmenEkleme() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("eklenecek ogretmen adi: ");
		String adi = scanner.nextLine();
		System.out.println("eklenecek ogretmen soyadi: ");
		String soyadi = scanner.nextLine();
		System.out.println("eklenecek ogretmen Tcsi: ");
		int id = scanner.nextInt();

		Ogretmen ogretmen = new Ogretmen(id , adi, soyadi);

		this.ogretmenRepository.save(ogretmen);
		
	}


	public void ogretmenSil() {
		System.out.println("Silinecek öğretmenin idsini giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogretmenRepository.delete(id);
		
	}


	public void ogretmenGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guncellenecek ogretmen adi: ");
		String adi = scanner.nextLine();
		System.out.println("Guncellenecek ogretmen soyadi: ");
		String soyadi = scanner.nextLine();
		System.out.println("Guncellenecek ogretmen TCnosu: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = new Ogretmen(id, adi, soyadi);
		this.ogretmenRepository.update(ogretmen);
		
	}


	public void ogretmenBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini goruntulemek istediginiz ogretmenin TCnosu: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = this.ogretmenRepository.findById(id);
		System.out.println("bilgilerini gormek istediginiz ogrenci: " + ogretmen);
		
	}


	public void ogretmenListesiniGoster() {
		System.out.println("*********************");
		System.out.println("*                   *");
		System.out.println("*  OGRETMEN LISTESI  *");
		System.out.println("*                   *");
		System.out.println("*********************");
		
		for(Ogretmen ogr : this.ogretmenRepository.findAll()) {
			System.out.println(ogr);
		}
		
	}

}
