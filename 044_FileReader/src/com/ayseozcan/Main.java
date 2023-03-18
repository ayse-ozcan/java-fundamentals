package com.ayseozcan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("liste.txt")){
			//tum satirlari okuyalim
			int okunan;
			while((okunan = reader.read()) != -1) {
				char okunanChar = (char) okunan;
				System.out.print(okunanChar);
			}
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosyayi okurken hata olustu");
			e.printStackTrace();
		}

	}

}
