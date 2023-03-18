package com.ayseozcan;

//personel ata class ; idarimemur alt class

public class IdariMemur extends Personel {

	private String gorevi;
	private long telSeriNo;

	public IdariMemur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdariMemur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String gorevi, long telSeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.gorevi = gorevi;
		this.telSeriNo = telSeriNo;
	}

	public int getZamKatsayisi() {
		return 2;
	}
	
	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	@Override
	public String toString() {
		return "IdariMemur [getGorevi()=" + getGorevi() + ", getTelSeriNo()=" + getTelSeriNo() + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
