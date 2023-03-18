package com.ayseozcan;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// Multi-threading application larda arraylist ler safe kabul edilmez.
		// Multithreading uygulamalarda ArrayList yerine Vektor kullanilmalidir.
		// Vektor sinifi thread-safe bir siniftir.
		// Vektorlerin dezavantaji ise arraylist e gore daha yavas calisir.

		List<String> vektor = new Vector<>();
		
		vektor.add("kedi");
		vektor.add("kus");
		vektor.add("kopek");
		
		for (String string : vektor) {
			System.out.println(string);
		}
		
		//Iterator kullanim:
		System.out.println();
		
		ListIterator<String> iterator = vektor.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
