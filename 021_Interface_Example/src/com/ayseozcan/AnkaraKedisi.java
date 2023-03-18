package com.ayseozcan;

public class AnkaraKedisi extends Hayvan implements IKuyrukluHayvan{

	public AnkaraKedisi(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("miyavv");

	}

	@Override
	public void yemekYe() {
		System.out.println("kedi " + this.getAd() + " sut iciyor");

	}

	@Override
	public void kuyrukSalla() {
		System.out.println(this.getAd() + " isimli kedi kuyrul salliyor");
	}

}
