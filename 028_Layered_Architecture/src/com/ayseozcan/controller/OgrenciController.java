package com.ayseozcan.controller;

import java.util.Scanner;

import com.ayseozcan.repository.OgrenciRepository;
import com.ayseozcan.repository.entity.Ogrenci;
import com.ayseozcan.utility.Database;

public class OgrenciController {

	private OgrenciRepository ogrenciRepository;

	public OgrenciController() {

		this.ogrenciRepository = new OgrenciRepository();
	}

	public void ogrenciEkleme() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("eklenecek ogrencinin adi: ");
		String adi = scanner.nextLine();
		System.out.println("eklenecek ogrencinin soyadi: ");
		String soyadi = scanner.nextLine();
		System.out.println("eklenecek ogrencinin numarasi: ");
		int id = scanner.nextInt();

		Ogrenci ogrenci = new Ogrenci(adi, soyadi, id);

		this.ogrenciRepository.save(ogrenci);

	}

	public void ogrenciSil() {
		
		System.out.println("Silinecek öğrencinin no'sunu giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogrenciRepository.delete(id);

	}

	public void ogrenciGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guncellenecek ogrencinin adi: ");
		String adi = scanner.nextLine();
		System.out.println("Guncellenecek ogrencinin soyadi: ");
		String soyadi = scanner.nextLine();
		System.out.println("Guncellenecek ogrencinin nosu: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = new Ogrenci(adi, soyadi, id);
		this.ogrenciRepository.update(ogrenci);
	}

	public void ogrenciBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini goruntulemek istediginiz ogrencinin nosu: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = this.ogrenciRepository.findById(id);
		System.out.println("bilgilerini gormek istediginiz ogrenci: " + ogrenci);
	}

	public void ogrenciListesiniGoster() {
		System.out.println("*********************");
		System.out.println("*                   *");
		System.out.println("*  OGRENCI LISTESI  *");
		System.out.println("*                   *");
		System.out.println("*********************");
		
		for(Ogrenci ogr : this.ogrenciRepository.findAll()) {
			System.out.println(ogr);
		}
		
	}

}
