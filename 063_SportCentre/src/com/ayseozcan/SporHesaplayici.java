package com.ayseozcan;

public class SporHesaplayici {

	public final static int KosuKaloriYakmaPerMinute100KGAgirlik = 10; // 100 kg agirliktaki bir insanın 1 dakikada 10
																		// kalori yakar.
	public final static int MekikKaloriYakmaPerMinute100KGAgirlik = 5;
	public final static int IpAtlamaKaloriYakmaPerMinute100KGAgirlik = 15;
	public final static int SinavKaloriYakmaPerMinute100KGAgirlik = 20;

	private int kosuKaloriPerMinute;
	private int mekikKaloriPerMinute;
	private int ipAtlamaKaloriPerMinute;
	private int sinavKaloriPerMinute;

	public SporHesaplayici(int agirlik) {
		this.kosuKaloriPerMinute = agirlik * KosuKaloriYakmaPerMinute100KGAgirlik / 100;
		this.mekikKaloriPerMinute = agirlik * MekikKaloriYakmaPerMinute100KGAgirlik / 100;
		this.ipAtlamaKaloriPerMinute = agirlik * IpAtlamaKaloriYakmaPerMinute100KGAgirlik / 100;
		this.sinavKaloriPerMinute = agirlik * SinavKaloriYakmaPerMinute100KGAgirlik / 100;
	}

	public int sporYap(String yapilacakHareket, int kacDakikaYapildi) {
		int harcanKalori = 0;

		if (yapilacakHareket.equalsIgnoreCase("Koşu")) {
			harcanKalori = this.kosuKaloriPerMinute * kacDakikaYapildi;
		} else if (yapilacakHareket.equalsIgnoreCase("mekik")) {
			harcanKalori = this.mekikKaloriPerMinute * kacDakikaYapildi;
		} else if (yapilacakHareket.equalsIgnoreCase("ipatlama")) {
			harcanKalori = this.ipAtlamaKaloriPerMinute * kacDakikaYapildi;
		} else if (yapilacakHareket.equalsIgnoreCase("şınav")) {
			harcanKalori = this.sinavKaloriPerMinute * kacDakikaYapildi;
		}

		return harcanKalori;
	}
}
