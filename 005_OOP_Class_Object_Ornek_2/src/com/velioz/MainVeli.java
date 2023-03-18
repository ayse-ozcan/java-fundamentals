package com.velioz;

public class MainVeli {

	public static void main (String[] args) {
		
		ParalelKenar paralelKenar1 = new ParalelKenar();
		
		
		Ucgen ucgen1 = new Ucgen();
		ucgen1.kenar1 = 7;
		ucgen1.kenar2 = 17;
		ucgen1.kenar3 = 77;
		
		System.out.println("Ucgen1 cevre:" + ucgen1.ucgenCevresi());
		
		System.out.println("ucgen1 kenarlar => kenar1:" + ucgen1.kenar1);
		ucgen1.kenarlaariUzat(10);
		System.out.println("ucgen1 kenarlar => kenar1:" + ucgen1.kenar1);
	}
}
