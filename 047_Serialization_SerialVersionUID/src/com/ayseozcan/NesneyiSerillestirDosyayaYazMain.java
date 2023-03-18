package com.ayseozcan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NesneyiSerillestirDosyayaYazMain {

	public static void main(String[] args) {

		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))) {

			Otomobil otomobil1 = new Otomobil("Opel", "Astra", 2017);
			Otomobil otomobil2 = new Otomobil("Audi", "A3", 2018);
			Otomobil otomobil3 = new Otomobil("BMW", "1.18", 2015);

			outStream.writeObject(otomobil1); // java gonderdigimiz otomobil objesini Ojject sinifindan bir nesneye
												// donusturecek sonra da bunu byte dizisi olarak otomobil.bin dosyasina
												// yazacak.
			outStream.writeObject(otomobil2);
			outStream.writeObject(otomobil3);

		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosyaya yazma hatasi");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("bilinemeyen bir hata olustu");
			e.printStackTrace();
		}

		System.out.println("Serialization process is completed");
	}

}
