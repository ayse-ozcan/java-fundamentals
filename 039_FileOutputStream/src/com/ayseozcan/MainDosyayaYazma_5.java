package com.ayseozcan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_5 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;

		try {

			// fileOutputStream = new FileOutputStream("C:\\Test3\\dosya.txt");
			fileOutputStream = new FileOutputStream("dosya.txt", false); // dosya mevcutsa icerigini silmez asagidakini
																			// apend eder. True ilr
			// Dosyaya String yazma
			// Bir String yazacagiz ve String i byte[] e donusturecegiz

			String mesaj = "Hello world!";
			byte[] byteArray = mesaj.getBytes();
			fileOutputStream.write(byteArray);

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
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}

			} catch (IOException e) {

				e.printStackTrace();
				System.out.println("dosya kapanmasi sirasinda bir hata olustu");
			}
		}

		System.out.println("Hoscakalin");

	}

}
