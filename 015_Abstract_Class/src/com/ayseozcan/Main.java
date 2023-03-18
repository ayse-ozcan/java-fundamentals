package com.ayseozcan;

public class Main {
	
	
	public static void hayvani2KezBesle(Hayvan h) {
		h.yemekYe();
		h.yemekYe();
	}
	
	//new ile nesne olusturamazsiniz
	
	public static void main(String[] args) {
	//asagidaki ornekte goruldugu uzere abstract bir siniftan nesne olusturulamaz
	//	Hayvan h = new Hayvan();
	//	h.sesCikar();
		
		Hayvan h = new Kedi("tekir", 2, 20);
		h.yemekYe();
		
		
		Main.hayvani2KezBesle(h);
		
//		Kedi kedi1 = new Kedi("minnos", 2, 21);
//		kedi.sutIc();
		
		
		//casting
		//advance konu
		((Kedi)h).sutIc();
	}

}
