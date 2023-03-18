package com.ayseozcan;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<Integer> listInteger = new ArrayList<>();
		
		listInteger.add(5);
		listInteger.add(24);
		listInteger.add(120);
		
		for(int i : listInteger) {
			System.out.println(i);
		}
		
		List<String> listString = new ArrayList<>();
		listString.add("Java");
		listString.add("Python");
		listString.add("JavaScript");
		
		for(String i : listString) {
			System.out.println(i);
		}

		System.out.println("----------------");
		
		GenericSinif<Integer> genericSinif = new GenericSinif<Integer>(25);
		System.out.println(genericSinif.getObj());
		
		GenericSinif<String> genericSinif2 = new GenericSinif<String>("Hello Java");
		System.out.println(genericSinif2.getObj());
		
//		Kare k = new Kare(5);
//		GenericSinif<Kare> genericSinif3 = new GenericSinif<Kare>(k);
		GenericSinif<Kare> genericSinif3 = new GenericSinif<Kare>(new Kare(5));
		int alan = genericSinif3.getObj().alanHesapla();
		System.out.println("kare alan: " + alan);
		
	}

}
