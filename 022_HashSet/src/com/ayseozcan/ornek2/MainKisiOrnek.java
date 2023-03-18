package com.ayseozcan.ornek2;

import java.util.HashSet;

public class MainKisiOrnek {

	public static void main(String[] args) {
		
		Kisi k1 = new Kisi("kagan", 10);
		Kisi k2 = new Kisi("fwefwe", 15);
		
		
		HashSet<Kisi> hashSetKisi = new HashSet<>();
		hashSetKisi.add(k1);
		hashSetKisi.add(k2);
		hashSetKisi.add(new Kisi("edff", 20));
		
		for(Kisi k : hashSetKisi) {
			System.out.println(k);
		}
		
		System.out.println("******************");
		Kisi k4 = new Kisi ("osman", 11);
		hashSetKisi.add(k4);
		
		for(Kisi k : hashSetKisi) {
			System.out.println(k);
		}
		
		

	}

}
