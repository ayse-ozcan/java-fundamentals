package com.ayseozcan;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void nemGoster(INemOlcer nemOlcer) {
		
		System.out.println(nemOlcer.nemOlc());
		
		
		
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + " " + tarihSaatGosterenCihaz.saatGoster() );
	}
	
	//interface ler abstraction saglar. 
	public static ITermometre termometreOlustur() {
		ITermometre termometre = new Sinbo();
		return termometre;
		
	}
	

	public static void main(String[] args) {
		
		Arzum arzum = new Arzum();
		System.out.println(arzum.sicakligiOlc());
		
		ITermometre termometre = new Sinbo();
		System.out.println(termometre.sicakligiOlc());
		
		Sinbo sinboCihaz = new Sinbo();
		sinboCihaz.sicakligiOlc();
		sinboCihaz.nemOlc();
		//List<String> myList = new ArrayList<String>();
		
		Main.nemGoster(sinboCihaz);
		Main.nemGoster(arzum);
		
		Casio casioCihaz = new Casio();
		//Main.nemGoster(casioCihaz); => hata verir cunku casiosinifi  nemolcer intarface ini implemet etmiyor!!
		
		System.out.println("\n---------");
		
		Main.tarihSaatGoster(casioCihaz);
		
		System.out.println("\n---------");
		
		ITermometre term = Main.termometreOlustur();
		System.out.println(term.sicakligiOlc());

	}

}
