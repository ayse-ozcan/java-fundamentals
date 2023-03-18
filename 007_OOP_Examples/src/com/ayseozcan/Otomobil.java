package com.ayseozcan;

public class Otomobil {
	
	public static String ARAC_TIPI = "Kara Araci";

	public String marka;
	public String model;
	public int yil;
	public int aracinKm;
	
	public Motor motor;
	
	public void bilgileriEkranaYaz() {
		
		System.out.println("Marka: " + this.marka + " Model: " + model + " yil: " + yil + " km " + aracinKm + " " +  Otomobil.ARAC_TIPI);
		this.motor.motorBilgileriniYazdir();
	}
		public void araciSur(int km) {
			System.out.println("Arac " + km + " km yol aliyor");
			aracinKm = aracinKm + km;
			
		}
	
		public void aracYilBilgisiDegistir(int yil) {
			
			this.yil = yil;
			
		}
	
}
