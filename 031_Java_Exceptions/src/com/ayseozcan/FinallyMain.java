package com.ayseozcan;

public class FinallyMain {

	// Finally blogu icindeki kodlariniz try catch statement larin sonunda mutlaka
	// calisir

	public static void main(String[] args) {
		
		try {
			int x = 5 / 0;
		} catch (Exception e) {
			System.out.println("bir exception olustu!");
		} finally {
			System.out.println("finally blogunun icine ne yazarsan yaz calisir");
		}
		System.out.println("bay");
		
		

		try {
			int x = 5 / 1;
		} catch (Exception e) {
			System.out.println("bir exception olustu!");
		} finally {
			System.out.println("finally blogunun icine ne yazarsan yaz calisir");
		}
		System.out.println("bay2");
		
		
		try {
			int y = 10 / 0;
			
		} catch (NullPointerException e) {
			System.out.println("null pointer exception aldik!");
		}finally {
			System.out.println("finally blogunun icine ne yazarsan yaz calisir");
		}
		System.out.println("bay3");
	}
	
	//FINALLY KULLANIMI:
	//Dosya kapatma
	//veritabani baglantisi kapatma
	//acik bir network socketini kapatma
	

}
