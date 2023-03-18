package com.ayseozcan;

public class Array1 {
	public static void main(String[] args) {
		int [][] cokBoyutluDizi = { {1, 2 , 3}, {4, 5 , 6} };
		
		//ornek= 3 satir 3 sutun
		int [][] cokBoyutluDizi2 = { {1, 2 , 3}, {4, 5 , 6}, {7, 8, 9} };
		
		//ornek
		//bir sinif listesi yapalim, icerigi su sekilde olsun
		//sira no; ,  ogrenci no , ad soyad 
		//1           101          ali kaya 
		//2			  102			veli oz
		//3			  103			zeynep caliskan
		
		String[][] sinifListesi = new String[3][4]; //3 satir 4 sutun
		
		sinifListesi[0][0] ="1";
		sinifListesi[0][1] ="101";
		sinifListesi[0][2] ="Ali";
		sinifListesi[0][3] ="Kaya";
		
		sinifListesi[1][0] ="2";
		sinifListesi[1][1] ="102";
		sinifListesi[1][2] ="veli";
		sinifListesi[1][3] ="oz";
		
		sinifListesi[2][0] ="3";
		sinifListesi[2][1] ="103";
		sinifListesi[2][2] ="zeynep";
		sinifListesi[2][3] ="caliskan";
		
		//ogrenci bilgilerini ekrana yazdiralim
		System.out.println("ogrenci listesi");
		System.out.println("*******************");
		System.out.println(sinifListesi[0][0]+ " " + sinifListesi[0][1]+ " " + sinifListesi[0][2]+" "+sinifListesi[0][3] );
		System.out.println("*******************");
		
		//i 0 1 2 =3 satir olacak!!!
		for(int i=0;i<3;i++) { //satir sayisi
			for(int j=0;j<4;j++) { //sutun sayisi
				
				System.out.print(sinifListesi[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------codeRefining---------");
		
		//burada 3(satir) ve 4(sutun) sayilarini kod icine direkt gommek dogru degil
		//bunun yerine length ozelligini kullanalim
		
		for(int i=0;i<sinifListesi.length;i++) { //satir sayisi 
			for(int j=0;j<sinifListesi[i].length;j++) { //sutun sayisi
				
				System.out.print(sinifListesi[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		System.out.println("****************************");
		int siraNo= Integer.parseInt(sinifListesi[0][0]);
		System.out.println(siraNo);
		
		String sayiStr="12.435";
		double sayi2=Double.parseDouble(sayiStr);
		System.out.println(sayi2);
		
		String sy="12.33356";
		float xx=Float.parseFloat(sy);
		System.out.println(xx);
		
		// WRAPPER SINIFLAR:
		//        byte    Byte
		//        short    Short
		//        int       Integer
		//        long    Long
		//        float    Float
		//        double    Double
		//        boolean    Boolean
		//        char    Character

		System.out.println("++++++3BoyutluDizi+++++++");
		
		int[][][] dizi3Boyut = new int[3][3][3];
		dizi3Boyut[0][0][0]=23;
		System.out.println(dizi3Boyut[0][0][0]);
		
		
		
		
	}
	
	
}
