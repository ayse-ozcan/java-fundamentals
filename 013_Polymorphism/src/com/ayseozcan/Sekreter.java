package com.ayseozcan;

public class Sekreter extends Personel {

	private long tel1SeriNo;
	private long tel2SeriNo;

	public Sekreter() { // yazmasak da calisir cunku kendi olusturur gorunmese de

		super();
	}

	public Sekreter(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			int tel1SeriNo, int tel2SeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, tel1SeriNo, tel1SeriNo);
		this.tel1SeriNo = tel1SeriNo;
		this.tel2SeriNo = tel2SeriNo;

		System.out.println("public sekreter (LONG TEL1SERINO)cagirildi");

	}

	// method overriding
	public int getZamKatsayisi() {
		return 2;
	}

	public long getTel1SeriNo() {
		return tel1SeriNo;
	}

	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}

	public long getTel2SeriNo() {
		return tel2SeriNo;
	}

	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}

	@Override
	public String toString() {
		return "Sekreter [getZamKatsayisi()=" + getZamKatsayisi() + ", getTel1SeriNo()=" + getTel1SeriNo()
				+ ", getTel2SeriNo()=" + getTel2SeriNo() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas() + ", getMaas()=" + getMaas()
				+ ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()=" + getCepTelNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
