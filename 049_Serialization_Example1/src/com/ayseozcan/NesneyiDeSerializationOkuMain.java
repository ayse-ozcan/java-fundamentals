package com.ayseozcan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneyiDeSerializationOkuMain {

	public static void main(String[] args) {

		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("karisiknesneler.bin"))) {

			// yazdigimiz sirayla okur.
			Otomobil oto1 = (Otomobil) inputStream.readObject();
			Otomobil oto2 = (Otomobil) inputStream.readObject();
			Otomobil oto3 = (Otomobil) inputStream.readObject();
			
			
			Ogrenci ogr1 = (Ogrenci) inputStream.readObject();
			Ogrenci ogr2 = (Ogrenci) inputStream.readObject();
			

			System.out.println(oto1);
			System.out.println(oto2);
			System.out.println(oto3);
			System.out.println(ogr1);
			System.out.println(ogr2);

		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosya okuma hatasi");
			e.printStackTrace();
		} catch (ClassNotFoundException e2) {
			System.out.println(e2);
		} catch (Exception e) {
			System.out.println("bilinemeyen bir hata olustu");
			e.printStackTrace();
		}

	}

}
