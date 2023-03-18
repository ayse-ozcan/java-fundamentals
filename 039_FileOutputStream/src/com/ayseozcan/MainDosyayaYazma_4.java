package com.ayseozcan;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_4 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;

		try {

			// fileOutputStream = new FileOutputStream("C:\\Test3\\dosya.txt");
			fileOutputStream = new FileOutputStream("dosya.txt", true); // dosya mevcutsa icerigini silmez asagidakini
																		// apend eder. True ilr
		 //Dosyaya byte[] yazdirma
			byte [] array = {74, 65, 86, 65};
			fileOutputStream.write(array);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			System.out.println("dosya/dizin bulunamadi");
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("dosya yazma hatasi");
		} catch (Exception e) {
			System.out.println("bilinmeyen bir hata olustu");
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {

				e.printStackTrace();
				System.out.println("dosya kapanmasi sirasinda bir hata olustu");
			}
		}

		System.out.println("Hoscakalin");

	}

}
