package com.ayseozcan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek {

	public static void main(String[] args) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt", true))) {
			writer.write("Ozgur Oz, 443\n");
			writer.write("Veli veli, 444\n");
			writer.write("zeki zek, 445\n");
			writer.write("sda zek, 456\n");
			writer.flush(); // flush kullanimi opsiyonel. //flush yazdiginizda buffer da o ana kadar biriken
							// veriler stream e yazilir
							// siz eger flush kullanmazsaniz buffer belli bir doluluga ulasinca veya belli
							// bir zaman periyodunda otomatik olarak java tarafindan flush lanir

			writer.write("wqeqwi zek, 875\n");
			writer.write("vcxcvi zek, 400\n");
			writer.write("qweqe zek, 211\n");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
