package com.ayseozcan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOgrenci {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciList = new ArrayList<>();
		//

		try (Scanner scanner = new Scanner(new FileReader("liste.txt"))) {
			// tum satirlari nasil okuruz

			while (scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();
				String[] array = okunanSatir.split(",");
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));
				ogrenciList.add(ogrenci);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(Ogrenci ogr : ogrenciList) {
			System.out.println(ogr);
		}
	}

}
