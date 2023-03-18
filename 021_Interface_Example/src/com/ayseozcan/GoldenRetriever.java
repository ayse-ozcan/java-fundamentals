package com.ayseozcan;

public class GoldenRetriever extends Hayvan implements IYirticiHayvan, IKuyrukluHayvan {

	public GoldenRetriever(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("hav hav");

	}

	@Override
	public void yemekYe() {
		System.out.println("kopek " + this.getAd() + " kemik yiyor");

	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd() + " adli goldenretriever" +  nesne + "nesnesine saldiriyor");
		
	}

	@Override
	public void kuyrukSalla() {
		System.out.println(this.getAd() + "isimli golden kuruk salliyor");
		
	}

}
