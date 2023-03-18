package com.ayseozcan;

public class Main {
	
	//Polymorphism over interfaces
	public static void kisaSureliUc(IUcabilir kus) {
		System.out.println("\n------\n");
		kus.kanatCirp();
		
		
	}
	//Polymorphism over inheritance
	public static void hayvan2KezSesCikarsin(Hayvan hayvan) {
		
		hayvan.sesCikar();
		hayvan.sesCikar();
	}
	
	public static void yirticiSaldirisi(IYirticiHayvan yirtici) {
		yirtici.saldir("tavsan");
		yirtici.saldir("tavsan");
		
	}
	
	public static IYirticiHayvan yirticiHayvanOlustur() {
		
		IYirticiHayvan yirticiHayvan = new GoldenRetriever("pup", 5, 20);
		return yirticiHayvan;
	}

	
	public static void belirtilenSureKadarKuyrukSalla(IKuyrukluHayvan kuyukluHayvan, int saniye) {
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		for(int i = 0; i < saniye; i++) {
			kuyukluHayvan.kuyrukSalla();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		//IUcabilir beyazPacaliGuvercin =new Guvercin("beyaz pacali", 1, 12);
		Guvercin beyazPacaliGuvercin =new Guvercin("beyaz pacali", 1, 12); //boyle de yazilabilir
		beyazPacaliGuvercin.gagala("yem");
		
		//IUcabilir serce = new Serce("Minik serce", 1, 8);
		Serce serce = new Serce("Minik serce", 1, 8);
		serce.gagala("yem");
		
		AnkaraKedisi kedi = new AnkaraKedisi("tekir", 5, 40);
		Main.kisaSureliUc(beyazPacaliGuvercin);
		Main.kisaSureliUc(serce);
		
		Main.hayvan2KezSesCikarsin(kedi);
		Main.hayvan2KezSesCikarsin(beyazPacaliGuvercin);
		Main.hayvan2KezSesCikarsin(serce);
		
		
		Kartal kartal = new Kartal("kara kartal", 10, 40);
		
		//bu kismi al hocadan
		
		//Kuyruk sall
		Main.belirtilenSureKadarKuyrukSalla(kedi, 7);
		
	}
	

}
