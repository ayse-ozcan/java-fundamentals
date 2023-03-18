package com.ayseozcan;

public class Kutu {

	public int hacim;
	
	
	public void degistir(int sayi) {
		hacim = sayi;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Kutu kutu1 = new Kutu();
		kutu1.hacim = 20;
		
		System.out.println(kutu1.hacim);
		kutu1.degistir(30);
		System.out.println(kutu1.hacim);
		
		
		Kutu kutu2;
		kutu2 = kutu1;
		kutu2.degistir(40);
		System.out.println(kutu1.hacim);
		
	}
}
