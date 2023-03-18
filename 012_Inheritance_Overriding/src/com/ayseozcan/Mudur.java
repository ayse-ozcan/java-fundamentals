package com.ayseozcan;

import java.util.Arrays;

public class Mudur extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Muhendis[] bagliMuhendisler;

	public Mudur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String makamAdi, long telSeriNo) {
		
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
	}
	
	public int getZamKatsayisi() {
		return 5;
	}



	public String getMakamAdi() {
		return makamAdi;
	}

	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	public Muhendis[] getBagliMuhendisler() {
		return bagliMuhendisler;
	}

	public void setBagliMuhendisler(Muhendis[] bagliMuhendisler) {
		this.bagliMuhendisler = bagliMuhendisler;
	}




	@Override
	public String toString() {
		return "Mudur [getMakamAdi()=" + getMakamAdi() + ", getTelSeriNo()=" + getTelSeriNo()
				+ ", getBagliMuhendisler()=" + Arrays.toString(getBagliMuhendisler()) + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
