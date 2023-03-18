package com.ayseozcan;

public class Guvercin extends Hayvan implements IUcabilir{

	public Guvercin(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("guguk...");

	}

	@Override
	public void yemekYe() {
		System.out.println("guvercin " + this.getAd() + " yem yiyor");
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adli guvercin 5 kez kanat cirpiyor");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adli guvercin kanatlarini yavasca temziliyor");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adli guvercin" +  nesne + "gagaliyor");
		
	}

}
