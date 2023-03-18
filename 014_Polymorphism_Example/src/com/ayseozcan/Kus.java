package com.ayseozcan;

public class Kus extends Hayvan {

	public void sesCikar() {

		System.out.println("Cik cik");
	}

	public Kus(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);

	}

	@Override
	public String toString() {
		return "Kus [getAd()=" + getAd() + ", getUzunluk()=" + getUzunluk() + "]";
	}

}
