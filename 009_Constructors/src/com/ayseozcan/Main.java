package com.ayseozcan;

public class Main {

	public static void main(String[] args) {

//		Motor motor = new Motor();

//		motor.setMotorHacmi(1400);
//		motor.setYakitTuketimi(10);

		Motor motor = new Motor(1400, "WH5456", 10);

		System.out.println(motor);

		Motor motor2 = new Motor(150000, "WS4654", 12000);

		System.out.println(motor2);

		motor2.setYakitTuketimi(15446);
		System.out.println(motor2);

		System.out.println();

		Otomobil otomobil1 = new Otomobil("BMW", "1.18", 2020, 57500, motor2);
		System.out.println(otomobil1);

		Otomobil otomobil2 = new Otomobil("Reanult", "Clio", 2017, 120000, new Motor(1200, "RN432", 8));
		System.out.println(otomobil2);

		otomobil2.setAracinKm(122000);
		System.out.println(otomobil2);

		otomobil2.getMotor().setMotorHacmi(1800);

		System.out.println(otomobil2.getMotor().getMotorHacmi());

		System.out.println();
		
		Otomobil otomobil3 = new Otomobil("Fiat", "Aegea");
		System.out.println(otomobil3);
		// otomobil3.getMotor().setMotorHacmi(1800); hata verir cunku otomobil3
		// nesnesine henuz bir motor nesnesi uye olarak atamadik
		
		otomobil3.setMotor(new Motor(2000, "SW2324", 7));
		System.out.println(otomobil3.getMotor());
		System.out.println(otomobil3);
		
		otomobil3.getMotor().setMotorHacmi(1000);
		System.out.println(otomobil3);
		otomobil3.getMotor().setBaziMetodBilgileri(2000, 11);
		System.out.println(otomobil3);
		

	}

}
