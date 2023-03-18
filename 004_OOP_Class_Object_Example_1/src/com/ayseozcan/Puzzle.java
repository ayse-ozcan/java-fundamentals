package com.ayseozcan;

public class Puzzle {
	
	public static final String tur = "oyuncak";
	
	public String adi;
	public String marka;
	public int parcaSayisi;
	public int stokMiktari;
	
	public String puzzleBilgileriniGetir() {
		
		String metin = "Ad: " + adi + " marka " + marka + " parcaSayisi" + parcaSayisi + " stokMiktari " + stokMiktari +
				" tur " + Puzzle.tur;
		
		return metin;
	}
}
