package com.ayseozcan;

public class Main {

	public static void hayvani3KezKonustur(Hayvan h) {

		System.out.println("hayvan 3 kez konusuyor");
		for (int i = 0; i < 3; i++) {
			h.sesCikar();
		}
	}

	public static void main(String[] args) {

		Kedi tekir = new Kedi("tekir", 3, 32);

		System.out.println(tekir.getAd() + " " + tekir.getKilosu());

		Kopek karabas = new Kopek("Karabas", 7, 75);
		karabas.sesCikar();

		// polymorphism

		Hayvan hayvan;
		hayvan = new Kedi("cancan", 4, 50);
		hayvan.sesCikar();

		hayvan = new Kopek("yalcin", 5, 71);
		hayvan.sesCikar();

		Main.hayvani3KezKonustur(karabas);

	}

}
