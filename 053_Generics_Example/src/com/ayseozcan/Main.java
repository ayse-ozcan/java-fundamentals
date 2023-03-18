package com.ayseozcan;

public class Main {
	
	//Generic Metodlar:
	
	public static <E> void myGenericMethod(E[] array) {
		//bu metod arrayin icindeki sekillerin toplam alanini hesaplasin.
		
		System.out.println("\n-------------\n");
		
		int toplam = 0;
		for (E obj : array) {
			Sekil objSekil = (Sekil) obj;
			if(objSekil != null) {
				toplam += objSekil.alanHesapla();
			}
		}
		System.out.println("Arrayin icindeki sekilllerin toplam alani: " + toplam);
	}
	

	public static void main(String[] args) {


		GeometrikAlan<DikUcgen, Kare> alan1 = new GeometrikAlan<DikUcgen, Kare>(new DikUcgen(10,10), new Kare(5));
		System.out.println("alan1 alan: " + alan1.geometriSeklinkAlanHesapla());
		
		GeometrikAlan<Dikdortgen, DikUcgen> alan2 = new GeometrikAlan<Dikdortgen, DikUcgen>(new Dikdortgen(8, 5), new DikUcgen(4, 12));
		System.out.println("alan2 alan: " + alan2.geometriSeklinkAlanHesapla());
		
		GeometrikAlan<Kare, Kare> alan3 = new GeometrikAlan<Kare, Kare>(new Kare(5), new Kare(5));
		System.out.println("alan3 alan: " + alan3.geometriSeklinkAlanHesapla());
		
		GeometrikAlan<Circle, Kare> alan4 = new GeometrikAlan<Circle, Kare>(new Circle(10), new Kare(5));
		System.out.println("alan4 alan: " + alan4.geometriSeklinkAlanHesapla());
		
		System.out.println("************************");

		Kare[] kareArray = new Kare[3];
		kareArray[0] = new Kare(3);
		kareArray[1] = new Kare(4);
		kareArray[2] = new Kare(5);	
		myGenericMethod(kareArray);
		
		Dikdortgen[] darr = new Dikdortgen[3];
		darr[0] = new Dikdortgen(3, 4);
		darr[0] = new Dikdortgen(4, 5);
		darr[0] = new Dikdortgen(5, 7);	
		myGenericMethod(darr);
		
		Sekil[] sarr = new Sekil[3];
		sarr[0] = new Dikdortgen(3, 4);
		sarr[1] = new Kare(5);
		sarr[2] = new DikUcgen(4, 4);
		myGenericMethod(sarr);
		
		
	}

}
