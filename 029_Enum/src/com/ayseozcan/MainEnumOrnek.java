package com.ayseozcan;

public class MainEnumOrnek {
	
	enum Size {
		LOW,
		MEDIUM,
		HIGH
	}
	
	
	enum Mevsimler{
		ILKBAHAR,
		YAZ,
		SONBAHAR,
		KIS,
		
	}

	//Enum lar bizi tek tek static degisken tanimlamaktan kurtarir
	// enum degerleri static ve final dir
	
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int LARGE = 3;
	
	public static void ekranaYaz(Mevsimler m) {
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		
		//Enum lar degismez(final dir)
		//enum lardan nesne turetilemez
		
		Size size = Size.HIGH;
		size = Size.MEDIUM;
		System.out.println(size);
		
		for(Size s : Size.values()) {
			System.out.println(s);
		}
		
		//DEGISMEZ DEGERLDE KULLANILIR. orn mesimler
		
		Size beden = size.MEDIUM;
		if(beden == size.MEDIUM) {
			System.out.println("M beden");
		}

		//enumlar sayesinde parametre gonderimi daha hizli ve dogru olur
		MainEnumOrnek.ekranaYaz(Mevsimler.SONBAHAR);
	}

}
