package com.ayseozcan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// HashMap ler key value pair lar (anahtar deger ciftleri) olarak tutulur.
		//Key -> value
		//(hashSet gibi) icindeki elemanlari sirali tutmaz.(arrayList ve linkedList in aksine)
		//icindeki elemanlari hashleyerek random bir sirada tutar
		//HashMap ler List lere gore random access (rastgele erisim) de tipki hashSetler gibi hizlidirlar
		
		//HashMap <Key, Value>
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(10, "Opel");
		hashMap.put(11, "Audi");
		hashMap.put(12, "BMW");
		hashMap.put(13, "VW");
		hashMap.put(14, "Renault");
		System.out.println(hashMap);
		
		//Ayni key e sahip baska bir kayit eklemeye calisirsaniz uzerine yazarsiniz
		
		hashMap.put(10, "Fiat");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(12));
		System.out.println(hashMap.get(10));
		System.out.println(hashMap.get(14));
		System.out.println(hashMap.get(70));
		
		if(hashMap.containsKey(70)) {
			System.out.println("mevcut");
		}else {
			System.out.println("mevcut degil");
		}
		
		//HashMap icerigini bastirma
		//1.yol
		//HashMap i set e donusturur ve loop ederiz
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar : " + entry.getKey() + " Deger : " + entry.getValue());
		}
		System.out.println();
		
		//2.yol
		
		for(Integer key : hashMap.keySet()) {
			System.out.println("Key : " + key + " value: " + hashMap.get(key));
		}
		
		//onemli metodlar
		//containsKey
		if(hashMap.containsKey(200)) {
			System.out.println("mevcut");
		}else {
			System.out.println("mevcut degil");
		}
		
		//containsValue
		if(hashMap.containsValue("Renault"))
			System.out.println("mevcut");
		else
			System.out.println("mevcut degil");
	}

}
