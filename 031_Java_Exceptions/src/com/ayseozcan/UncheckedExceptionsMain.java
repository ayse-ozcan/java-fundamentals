package com.ayseozcan;

public class UncheckedExceptionsMain {

	public static void main(String[] args) {

		// bu exceptionlari programcinin ongormesi ve kontrol etmesi lazim
		// java bu tarz exceptionlar icin hata ya da uyari vermez.

		String s = null;
		
		try {
			System.out.println(s.length()); // nullPointerException
		} catch (Exception e) {
			System.out.println("hatayi yakaladik");
			//log a bu hatayi yaz.
		}

		System.out.println("programin sonu");
		
	}

}
