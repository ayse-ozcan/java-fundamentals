package com.ayseozcan;

public enum UcusTipi {

	EKONOMIK(100, "ekonomik ucus"),
	OZEL(200, "ozel ucus"),
	VIP(300, "vip ucus");
	
	int tip;
	String metin;
	
	private UcusTipi(int tip, String metin) {
		this.tip = tip;
		this.metin = metin;
	}

	public int getTip() {
		return tip;
	}

	public String getMetin() {
		return metin;
	}
	
	
	
	
}
