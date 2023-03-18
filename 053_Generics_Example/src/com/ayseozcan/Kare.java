package com.ayseozcan;

public class Kare extends Sekil{

	private int kenarUzunluk;

	public Kare(int kareUzunluk) {
		super();
		this.kenarUzunluk = kareUzunluk;
	}

	public int getKareUzunluk() {
		return kenarUzunluk;
	}

	public void setKareUzunluk(int kareUzunluk) {
		this.kenarUzunluk = kareUzunluk;
	}

	@Override
	public String toString() {
		return "Kare [kareUzunluk=" + kenarUzunluk + "]";
	}
	
	public int alanHesapla() {
		return(kenarUzunluk * kenarUzunluk);
	}
}
