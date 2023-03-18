package com.ayseozcan;

public class Serce extends Hayvan implements IUcabilir  {

	public Serce(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		
	}

	@Override
	public void sesCikar() {
		System.out.println("cik...");

	}

	@Override
	public void yemekYe() {
		System.out.println("serce " + this.getAd() + " yem yiyor");

	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adli serce 10 kez kanat cirpiyor");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adli serce kanatlarini temizliyor");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adli serce" +  nesne + "gagaliyor");
		
	}

}
