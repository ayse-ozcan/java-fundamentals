package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		
		
		DaireBaskani daireBaskani = new DaireBaskani("Ayse", "Ozcan", "6456456", 25, 30000, 1, 5464L, "insaat emlak daire", 564646L);
		System.out.println(daireBaskani);
		
		Muhendis m = new Muhendis("Mahmut" , "Kara", "5465456", 50, 30000, 1, 45646465L, "insaat muh");
		System.out.println(m);
		
		System.out.println(m.getAd() + "zam katsayisi " + m.getZamKatsayisi());

	}

}
