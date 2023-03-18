package com.ayseozcan;

public class DaireBaskani extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Mudur[] bagliMudurler;

	public DaireBaskani(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String makamAdi, long telSeriNo) {
//		
//		this.setAd(ad);
//		this.setSoyad(soyad);
//		this.setTcKimlik(tcKimlik);
//		this.setYas(yas);
//		this.setMaas(maas);
//		this.setKidemBilgisi(kidemBilgisi);
//		this.setCepTelNo(cepTelNo);
		//yukaridaki satirlar yerine ust sinifin consructor ini cagirin
		
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		
		this.telSeriNo = telSeriNo;
		this.makamAdi = makamAdi;
	}
	
	//method overriding: ust sinifta tanimli metodu eziyorum. ust sinifta olan metodu burada da yazarsam overriding
	public int getZamKatsayisi() {
		return 8;
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

	public Mudur[] getBagliMudurler() {
		return bagliMudurler;
	}

	public void setBagliMudurler(Mudur[] bagliMudurler) {
		this.bagliMudurler = bagliMudurler;
	}

	@Override
	public String toString() {
		return "DaireBaskani [getMakamAdi()=" + getMakamAdi() + ", getTelSeriNo()=" + getTelSeriNo() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

}
