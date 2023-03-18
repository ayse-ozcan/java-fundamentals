package com.ayseozcan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Otomobil> cars = new ArrayList<>();
		cars.add(new Otomobil("opel", "astra", 2009));
		cars.add(new Otomobil("bmw", "fdsda", 2020));
		cars.add(new Otomobil("ahahl", "dffa", 2019));
		cars.add(new Otomobil("Audi", "A4", 2012));

		// audi a4 u listeden sil
		
	

//		for (Otomobil oto : cars) {
//			if (oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
//				cars.remove(oto);
//				// bu sekilde silemeyiz iterator sayesinde dongu icinde istedigimiz elemani
//				// silebiliriz
//			}
//		}
		
		for(Iterator<Otomobil> iterator = cars.iterator(); iterator.hasNext();) {
			Otomobil oto = (Otomobil) iterator.next();
			if(oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
				iterator.remove();
			}
		}
		System.out.println(cars);

	}

}
