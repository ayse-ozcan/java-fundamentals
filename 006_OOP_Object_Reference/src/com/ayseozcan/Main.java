package com.ayseozcan;

public class Main {

	public static void main(String[] args) {
		
		Kutu kutu1 = new Kutu();
		kutu1.hacim = 50;
		
		Kutu kutu2= new Kutu();
		kutu1.hacim = 60;
		
		Kutu kutu3 = new Kutu();
		kutu1.hacim = 82;
		
		//int[] dizi = new int[3];
		
		Kutu [] dizi = new Kutu[3];
		
		dizi [0] = kutu1;
		dizi [0].hacim =90;
		System.out.println();
		
		dizi [1] = new Kutu();
		dizi[1].hacim = 120;
		
		if (dizi[2] == null) {
			System.out.println("dizinin ikinci indexi null");
		}
		
	}

}
