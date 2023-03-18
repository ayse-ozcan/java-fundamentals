package com.ayseozcan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjeyiYaz {

	public static void main(String[] args) {

		Ogrenci ogrenci1 = new Ogrenci("ece", 10, "bilgisayar muh");
		Ogrenci ogrenci2 = new Ogrenci("ege", 11, "maden muh");
		Ogrenci ogrenci3 = new Ogrenci("eda", 12, "jeoloji muh");
		Ogrenci ogrenci4 = new Ogrenci("eren", 13, "genetik muh");
		Ogrenci ogrenci5 = new Ogrenci("emin", 14, "yazilim muh");

		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(ogrenci1);
		ogrenciList.add(ogrenci2);
		ogrenciList.add(ogrenci3);
		ogrenciList.add(ogrenci4);
		ogrenciList.add(ogrenci5);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrencilerliste.bin"))) {
			
			out.writeObject(ogrenciList);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			
		}
		System.out.println("arraylist ve icindeki ogrenci nesneleri dosyaya yazildi");
	}

}
