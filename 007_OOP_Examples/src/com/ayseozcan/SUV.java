package com.ayseozcan;

public class SUV {

	public String marka;
	public String model;
	public int yil;
	public int aracinKm;
	public String cekisSistemi;
	public Motor motor;

	public void bilgileriEkranaYaz() {

		System.out.println("Marka: " + this.marka + " Model: " + model + " yil: " + yil + " km " + aracinKm + " cekis sistemi:" + this.cekisSistemi);
		this.motor.motorBilgileriniYazdir();
	}

}
