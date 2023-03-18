package com.ayseozcan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainDosyaYaz {

	public static void main(String[] args) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			
			Otomobil otomobil1 = new Otomobil("Opel", "Astra", 2017);
			Otomobil otomobil2 = new Otomobil("Audi", "A3", 2018);
			Otomobil otomobil3 = new Otomobil("BMW", "1.18", 2015);
			Otomobil otomobil4 = new Otomobil("Renault", "Clio", 2020);
			
			Motor m1 = new Motor(145);
			otomobil1.setMotor(m1);
			
			Motor m2 = new Motor(154);
			otomobil2.setMotor(m2);
			
			Motor m3 = new Motor(176);
			otomobil3.setMotor(m3);
			
			Motor m4 = new Motor(125);
			otomobil4.setMotor(m4);
			
//			out.writeObject(otomobil4);
//			out.writeObject(otomobil1);
//			out.writeObject(otomobil2);
//			out.writeObject(otomobil3);
			
		
			ArrayList<Otomobil> otoList = new ArrayList<>();
			otoList.add(otomobil1);
			otoList.add(otomobil2);
			otoList.add(otomobil3);
			otoList.add(otomobil4);
			out.writeObject(otoList);
			
			Ogrenci ogr1 = new Ogrenci("zeynep", 100, "fsdgf");
			Ogrenci ogr2 = new Ogrenci("derya", 400, "fsdgf");
			Ogrenci ogr3 = new Ogrenci("zeki", 200, "fsdgf");
			
			ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
			ogrenciList.add(ogr1);
			ogrenciList.add(ogr2);
			ogrenciList.add(ogr3);
			out.writeObject(ogrenciList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Process is completed");

	}

}
