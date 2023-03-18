package com.ayseozcan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_2 {

	public static void main(String[] args) {
		
		FileOutputStream fileOutputStream = null;
		
		// Dosyayi acmak icin:
		//2.yol : FileOutput icine parametre olarak String vermek
		
		try {
		
			//fileOutputStream = new FileOutputStream("C:\\Test3\\dosya.txt");
			fileOutputStream = new FileOutputStream("dosya.txt");
			fileOutputStream.write(74);
			fileOutputStream.write(65);
			fileOutputStream.write(86);
			fileOutputStream.write(65);
			fileOutputStream.write(10);
			fileOutputStream.write(72);
			fileOutputStream.write(73);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("dosya/dizin bulunamadi");
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("dosya yazma hatasi");
		} catch (Exception e) {
			System.out.println("bilinmeyen bir hata olustu");
		}
		finally {
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
