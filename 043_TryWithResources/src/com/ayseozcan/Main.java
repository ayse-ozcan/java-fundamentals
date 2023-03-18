package com.ayseozcan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	// trywithresources kullanimi****
	// closeable inteface ini implement eden herhangi bir tryWithResources kalibi
	// ile kullanabilirsiniz.
	// bu sekilde close icin ekstra bir finally kod blogu yazmak zorunda
	// kalmazsiniz.
//	try(declare resources here){
//		
//	}catch(Exception e) {
//		//exception handling
//	}
//	
	public static void main(String[] args) {

		try (FileWriter writer = new FileWriter("markalar.txt")) { //,TRUE eklersen uzerine yazar.

			Scanner scanner = new Scanner(System.in);
			String marka = "";
			// kullanicidan marka girmesini isteyin
			// kullanici -1 girene kadar kullanicinin girdigi markayi "markalar.txt"
			// dosyasina yazdirin
			
			while (true) {
				System.out.println("Lutfen bir marka giriniz: ");
				marka = scanner.nextLine();
				if (marka.equals("-1")) {
					System.out.println("programdan cikiliyor, lutfen dosyayi kontrol ediniz...");
					break;

				}
				writer.write(marka + "\n");
			}

		} catch (IOException e) {
			System.out.println("IO exception aldik");
			e.printStackTrace();
		}
	}

}
