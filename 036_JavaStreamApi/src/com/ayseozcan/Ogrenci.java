package com.ayseozcan;

import java.util.Random;

public class Ogrenci {

	private String ad;
	private int id;
	
	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + "]";
	}
	
	public void sinavNotu()
	{
		Random random =new Random();
		int sayi = random.nextInt(1,100);
		System.out.println(sayi);
	}
	
}
