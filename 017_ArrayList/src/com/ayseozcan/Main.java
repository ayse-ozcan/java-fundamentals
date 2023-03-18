package com.ayseozcan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	// private static void printArrayList(ArrayList<Kisi> list)
	private static void printArrayList(List<Kisi> list) {

		System.out.println("\n -------------------- \n");

		for (Kisi kisi : list) {
			// System.out.println(kisi.getAd() + " " + kisi.getSoyad()); kisi sinifinda
			// toString yapmazsan boyle cagirirsin
			System.out.println(kisi);
		}

	}
	
	public static void printList(List<String> list) {
		for(String name : list) {
			System.out.println(name);
		}
		
	}
	
	

	private static List<String> listeOlustur() {

//		List<String> lst = new ArrayList<>();
//		lst.add("ayse");
//		lst.add("veli");
//		
//		return lst;

		List<String> lst = new LinkedList<>(); // linkedlist de bir arayuz, arayuzlerin ozellikleri farkli.

		lst.add("ayse");
		lst.add("veli");

		return lst;

	}

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		System.out.println(cars);

		for (String car : cars) {
			System.out.println(car);
		}

		// ---------------------------------

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(3);
		arrList.add(7);
		arrList.add(10);
		arrList.add(3);
		System.out.println(arrList);
		arrList.remove(2);
		System.out.println(arrList);

		// ArrayListler icinde kendi nesnelerimizi kullanalim

		System.out.println();

		Kisi k1 = new Kisi("john", "smith");
		Kisi k2 = new Kisi();
		k2.setAd("robert");
		k2.setSoyad("donavan");
		Kisi k3 = new Kisi("ayse", "ozcan");

		ArrayList<Kisi> list = new ArrayList<>();
		list.add(k1);
		list.add(k2);
		list.add(k3);

		Main.printArrayList(list);

		// remove
		// list.remove(k2); nesne referansini gonderip cikarma
		list.remove(1); // index gonderip cikarma
		Main.printArrayList(list);

		List<Kisi> list2 = new ArrayList<>();
		list2.add(new Kisi("Ahmet", "Emre"));
		Main.printArrayList(list2);

		// ArrayList araya eleman ekleme:

		List<String> l = Main.listeOlustur();

		for (String s : l) {

			System.out.println(s);
		}
		// araya eleman ekleme
		l.add(1, "ahmet");
		System.out.println();
		for (String s : l) {

			System.out.println(s);
		}

		// Array List: hizli random erisimi saglar, dizinin icindeki herhangi bir
		// elemani sabit surede getirir.
		// Ancak array listte yapilan araya eleman ekleme ya da cikarma gibi islemler
		// cok uzun vakit alir.
		// Linked listte araya eleman ekleme ya da cikarma array listlere gore cok hizli
		// olur.
		// Bellirli bir elemana erisim array liste gore yavastir.
		System.out.println();
		
		System.out.println(l.get(1));
		System.out.println("**************************");
		
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("John");
		linkedList.add("Barbara");
		//System.out.println(linkedList);
		
		Main.printList(linkedList);
		Main.printList(cars);
		
		
		System.out.println();
		linkedList.remove("John");
		Main.printList(linkedList);
		
		System.out.println(linkedList.get(0));
		
		//araya eleman ekleme
		linkedList.add(1, "Robert");
		System.out.println(linkedList);
		
		
	}

}
