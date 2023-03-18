package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = " Audi";
		otomobil1.model = " A3";
		otomobil1.yil =  2012;
		otomobil1.aracinKm = 0;
		otomobil1.motor = new Motor();
		otomobil1.motor.motorHacmi = 1400;
		otomobil1.motor.saseNo = "AU43534453K";
		otomobil1.motor.yakitTuketimi = 7;
		
		otomobil1.bilgileriEkranaYaz();
		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = " Opel";
		otomobil2.model = " Astra";
		otomobil2.yil =  2015;
		otomobil2.aracinKm = 5000;
		otomobil2.motor = new Motor();
		
		otomobil2.bilgileriEkranaYaz();
		
		otomobil2.araciSur(500);
		otomobil2.bilgileriEkranaYaz();
		
		otomobil2.aracYilBilgisiDegistir(2020);
		otomobil2.bilgileriEkranaYaz();
		
		SUV jeep = new SUV();
		jeep.aracinKm = 20000;
		jeep.marka = "JEEP";
		jeep.motor = new Motor();
		jeep.motor.motorHacmi = 1200;
		jeep.bilgileriEkranaYaz();
		
		
		//Motor nesnesi bagimsiz uretme
		
		Motor m1 = new Motor();
		m1.motorHacmi = 2033;
		m1.saseNo = "G384293";
		m1.yakitTuketimi = 5;
		m1.motorBilgileriniYazdir();
		
		otomobil2.motor = m1;
		otomobil2.bilgileriEkranaYaz();
		
		System.out.println();
		Otomobil temp;
		temp = otomobil2;
		temp.motor.motorHacmi = 1100;
		System.out.println(otomobil2.motor.motorHacmi);
		
		

	}

}
