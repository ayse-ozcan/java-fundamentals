package com.ayseozcan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BufferedReaderOrnek2 {

	public static void main(String[] args) {
		List<Ogrenci> ogrenciList = new ArrayList<>();

		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("liste.txt")))) {
			// scanner.hasNextLine() => okunav=cak satir varsa true yoksa false
			while (scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();
				String[] array = okunanSatir.split(",");
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));
				ogrenciList.add(ogrenci);

			}

		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadi");
			e.printStackTrace();
		}
//		for (Ogrenci ogr : ogrenciList) {
//			System.out.println(ogr);
//		}
	}

}
