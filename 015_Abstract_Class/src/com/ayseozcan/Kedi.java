package com.ayseozcan;

public class Kedi extends Hayvan {
	
	public void sesCikar() {
		
		System.out.println("Miyavvv");
	}

	public void yemekYe() {
		System.out.println("kedi yemek yiyor");
	}
	
	public void sutIc() {
		System.out.println("kedi sut iciyor");
	}
	
	public Kedi(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		
	}

	@Override
	public String toString() {
		return "Kedi [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunluk()=" + getUzunluk() + "]";
	}

	
	
	

}
