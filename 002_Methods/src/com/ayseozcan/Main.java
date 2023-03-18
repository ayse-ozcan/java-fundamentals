package com.ayseozcan;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static final void hello() {
		
		//public => access modifier(erisim belirleyici) // public:Butun package lar kullanabilir
														// protected: sadece ayni package ici kullanim saglar
														// private: sadece sinif ici kullanim saglar
		
		//static=> (zorunlu degil)-- static metodlarin hepsi program calisir calismaz adreslenir ve degismez.
		 			// static olmasaydi adres nesne olusunca olusacakti.
		
		//final=>(zorunlu degil) metodun basinda final yazilirsa o metod override edilemez
		//final class in basina gelirse; o siniftan yeni sinif turetilemez.
		//final i en cok sabit olan degiskenlerde kullaniriz
		//final static double PI =  3.14; PI degerini degistiremezsiniz anlamina gelir.
		
		//Return type: zorunludur. Hic bir sey return etmeyecekse void yazilmali
		//hello:metod ismi yazilmak zorundadir
		//parantezler:parantezlerin icine parametre ya da parametreler yazabilirsiniz (opsiyonel)
		//{}: metodun icerigini(code body) suslu parantezlerin icine yazmaniz gerekir.
		
		
		
		System.out.println("Hello from hello method in Main.java");
	}
	
	//parametreli metod
	
	private static int kareAl(int sayi) {
		int sonuc=sayi*sayi; //mesela burada sonuc int tipindedir
		return sonuc;		// 
	}
	
	
	//random sayi ureten metod
	public static int randomNumber() {
		Random random = new Random();
		int result = random.nextInt(100);
		return result;
	}
	
	//ust limiti parametre olarak alan yeni bir randomNuber metodu
	//method overloading
	public static int randomNumber(int ustLimit) {
		Random random = new Random();
		int result = random.nextInt(ustLimit);
		return result;
	}
	
	private static int randomNumberV3() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Lutfen alt limit giriniz:");
		int altLimit=scanner.nextInt();
		System.out.println("Lutfen ust limit giriniz:");
		int ustLimit=scanner.nextInt();


		Random random=new Random();
		int sonuc=random.nextInt(altLimit, ustLimit);
		
		//cozum2
		sonuc=random.nextInt(ustLimit-altLimit)+altLimit;
		return sonuc;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Merhaba");
		
		Main.hello(); // metod cagirma
		// hello(); //bu sekilde de cagirilir
		
		com.velioz.YardimciSinif.hello();
		
		//YardimciSinif.hello diyip import edilip direkt kullanilir.
		
		//eger yardimci YardimciSinif icindeki hello() metodu protected ya da private olsaydi cagirilamazdi
		
		int matSonuc=Main.kareAl(5);
		System.out.println(matSonuc);
		
		System.out.println("sayi1" + randomNumber());
		System.out.println("sayi2" + randomNumber());
		
		int randomSayi3=Main.randomNumber();
		System.out.println(randomSayi3);
		
		System.out.println("sayi" + Main.randomNumber(1000));
		
		
		System.out.println("Hoscakalin");
		System.out.println(randomNumberV3());
		
		System.out.println("kelime giriniz:");
		Scanner scanner=new Scanner(System.in);
		String kelime=scanner.nextLine();
		
		System.out.println("tekrar sayisi giriniz:");
		int tekrarSayisi=scanner.nextInt();
		metniTekrarla(kelime,tekrarSayisi);
		

	}
	
	private static void metniTekrarla(String kelime, int tekrarSayisi) {
		for (int i =0; i<tekrarSayisi;i++) {
			System.out.println(kelime);
			
		}
	}
	//kullanicinin girdigi alt ve ust limitler arasinda random bir sayi ureten 
	//main icinde kullanicidan bir string alin ve bu string in tekrarlanma sayisini(tamsayi) alin
	//aldiginiz nu 2 degeri tekrarla isimli bir metoda gonder

	

	}

	

