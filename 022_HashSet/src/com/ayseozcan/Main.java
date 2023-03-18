package com.ayseozcan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {

	
	//HashSet ler Javan da elemanlara random olarak cok hizli bir sekilde erismek icin kullanilan veri yapilaridir
	//Hizli olmasinin nedeni elemanlara erisilirken hash kodlarinin kullanilmasidir
	//Hash code sayesinde herhangi bir elemani unique olarak tanimlanabilir
	//onemli!!!!
	//HashSet ayni elemani barindirmaz.
	
	public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<>();
		hashset.add("kus");
		hashset.add("kopek");
		hashset.add("kedi");
		hashset.add("kedi"); //  ayni elemandan iki tane olamaz.
		System.out.println("hashSet");
		for (String str : hashset) {
			System.out.println(str);
		}
		
		//Array list den farki:
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("kus");
		arrayList.add("kedi");
		arrayList.add("kopek");
		arrayList.add("kus");
		
		System.out.println("arrayList");
		for (String str : arrayList) {
			System.out.println(str);
		}
		
		//hashSet arrayListe gore aradiginiz degeri cok daha hizli getirir.
		if (hashset.contains("kus")) {
			System.out.println("kus mevcut");
			
		}else {
			System.out.println("kus mevcut degil");
			
		}
		//HashSetler arasi fark bulma:
		
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("kaplan");
		hashSet2.add("kedi");
		hashSet2.add("aslan");
		
		//Fark 2 adimda bulunur
		//1.adim
		
		HashSet<String> fark = new HashSet<>(hashSet2);
		//hashSet2 nin fark isminde bir kopyasini olusturdum
		
		//2. adim
		fark.removeAll(hashset); //fark isimli hashSet den ilk hashSetimin elemanlarini cikardim. geriye faklilar kaldi
		
		System.out.println(fark);
		
		
	}

}
