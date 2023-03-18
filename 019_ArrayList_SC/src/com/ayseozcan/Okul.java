package com.ayseozcan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Okul {

	private String okulAdi;
	private String okulAdresi;
	private List<Sinif> siniflarList;

	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarList = new LinkedList<Sinif>();

	}

	// okulun icindeki siniflari yazdirir
	public void siniflariYazdir() {
		System.out.println("***" + this.okulAdi + " okulundaki siniflar***");

		for (Sinif sinif : this.siniflarList) {
			System.out.println("sinif adi: " + sinif.getSinifAdi() + " lokasyon" + sinif.getLokasyon());
		}
	}

	public void okuldanSinifCikar(String sinifAdi) {

		Sinif silinecekSinif = null;

		for (Sinif sinif : this.siniflarList) {

			if (sinif.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				silinecekSinif = sinif;
				break;
			}
		}

		if (silinecekSinif != null) {
			this.siniflarList.remove(silinecekSinif);

		} else {
			System.out.println(sinifAdi + "  sinifi bu okulda bulunamadi!");
		}
	}

	// *********************
	// iterators ile safe delete operation:
	public void okuldanSinifCikarIterators(String sinifAdi) {
		Iterator<Sinif> i = this.siniflarList.iterator();
		while (i.hasNext()) {

			Sinif snf = i.next();
			if (snf.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				i.remove();
				break;
			}
		}

	}

	public void okuldakiOgrencileriYazdir() {

		System.out.println("***" + this.okulAdi + " okulundaki ogrenciler***");
		int sayac = 0;
		for (Sinif sinif : this.siniflarList) {
			System.out.println(sinif.getSinifAdi() + " : ");
			for (Ogrenci ogrenci : sinif.getOgrencilerArrayList()) {
				System.out.println("ogrenci adi" + ogrenci.getAd() + "soyadi " + ogrenci.getSoyad());
				sayac++;
			}
		}
		System.out.println("bu okulda " + sayac + " ogrenci vardir");
	}
	
	//parametre olarak sinifAdi girilen ve sonucta ilgili sinif nesnesini return eden bir metod
	public Sinif getSinif(String sinifAdi) {
		for (Sinif sinif : siniflarList) {
			if(sinif.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				return sinif;
			}
		}
		return null;
	}

	public void sinifEkle(Sinif sinif) {

		this.siniflarList.add(sinif);
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}

	public String getOkulAdresi() {
		return okulAdresi;
	}

	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}

	public List<Sinif> getSiniflarList() {
		return siniflarList;
	}

	public void setSiniflarList(List<Sinif> siniflarList) {
		this.siniflarList = siniflarList;
	}

}
