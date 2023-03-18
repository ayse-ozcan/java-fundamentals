package com.ayseozcan;

public class Kopek extends Hayvan {

	public void sesCikar() {

		System.out.println("Hav hav");
	}

	public Kopek(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);

	}

	@Override
	public String toString() {
		return "Kopek [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunluk()=" + getUzunluk() + "]";
	}

}
