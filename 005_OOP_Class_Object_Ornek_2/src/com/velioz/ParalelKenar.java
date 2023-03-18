package com.velioz;

public class ParalelKenar {

	 //public: tum paketlerden erisilebilir
					//protected: sadece ayni paketler erisebilir. bir sey yazmazsan protected kabul eder.
					//private: sadece bulundugu class icinden erisilebilir.
					//default (bos birakmak) protected gibi davranir.
	
	int kenarKisa;
	int kenarUzun;
	
	private String isim;
	
	private String getIsim() {
		
		return isim;
	}
	
}
