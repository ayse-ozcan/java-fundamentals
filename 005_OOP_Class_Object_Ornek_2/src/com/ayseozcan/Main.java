package com.ayseozcan;

import com.velioz.ParalelKenar;
import com.velioz.Ucgen;

public class Main {
	
	public static void main (String[] args) {
		
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 7;
		dikdortgen1.kisaKenar = 10;
		
		Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar = 8;
		dikdortgen2.kisaKenar = 20;
		
		System.out.println("dikdortgen1 alan: " + dikdortgen1.alanHesapla());
		System.out.println("dikdortgen2 alan: " + dikdortgen2.alanHesapla());
		
		Kare kare1 = new Kare();
		kare1.kenar = 10;
		System.out.println("kare1 alani: " + kare1.alanHesapla());
		
		ParalelKenar paralelKenar1 = new ParalelKenar();
		//erisilemez cunku default..
		
		Ucgen ikizKenar = new Ucgen();
		ikizKenar.kenar1 = 10;
		ikizKenar.kenar2 = 20;
		ikizKenar.kenar3 = 30;
		
		
		System.out.println("ucgen cevre:" + ikizKenar.ucgenCevresi());
		
		
		
		
	}

}
