package com.velioz;

public class Ucgen {
	
	public int kenar1;
	public int kenar2;
	public int kenar3;
	
	public int ucgenCevresi() {
		
		return(kenar1 + kenar2 + kenar3);
	}
	
	//yalnizca com.velioz paketindeki classlar erisebilir.
	
	protected void kenarlaariUzat (int uzatmaMiktari) {
		kenar1 += uzatmaMiktari; //kenar1 = kenar1 + uzatmaMiktari
		kenar2 += uzatmaMiktari;
		kenar3 += uzatmaMiktari;
		
	}
	
	
}
