package com.ayseozcan;

public class Main {

	public static void ucusBilgileriniGoster(UcusTipi ucusTipi) {
		
		System.out.println("ucus tipi: " + ucusTipi.getTip() + " ucus tipi aciklamasi: " + ucusTipi.getMetin());
		
	}
	
	public static void main(String[] args) {
		
		Main.ucusBilgileriniGoster(UcusTipi.EKONOMIK);
		Main.ucusBilgileriniGoster(UcusTipi.OZEL);
		Main.ucusBilgileriniGoster(UcusTipi.VIP);
		
	}

}
