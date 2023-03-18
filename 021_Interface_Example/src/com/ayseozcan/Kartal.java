package com.ayseozcan;

public class Kartal extends Hayvan implements IUcabilir, IYirticiHayvan{

	
	

	public Kartal(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adli kartal kanat cirpiyor");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adli kartal kanatlarini temizliyor");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adli kartal" +  nesne + "gagaliyor");
		
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd() + " adli kartal" +  nesne + "nesnesine saldiriyor");
		
	}

}
