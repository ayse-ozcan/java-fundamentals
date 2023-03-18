package com.ayseozcan;

public class Muhendis extends Personel {

	private String uzmanlikAlani;

//	public Muhendis() {
//		super();
//		//super: ust sinifin consructor i 
	// superi kaldirsak da calisir cunku biz kaldirsak da super i kendi koyar
//	}

	public Muhendis(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;

	}

	// method overriding
	public int getZamKatsayisi() {
		return 3;
	}

	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}

	@Override
	public String toString() {
		return "Muhendis [getZamKatsayisi()=" + getZamKatsayisi() + ", getUzmanlikAlani()=" + getUzmanlikAlani()
				+ ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik()
				+ ", getYas()=" + getYas() + ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi()
				+ ", getCepTelNo()=" + getCepTelNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
