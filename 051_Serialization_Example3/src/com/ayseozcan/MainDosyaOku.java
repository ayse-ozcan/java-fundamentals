package com.ayseozcan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainDosyaOku {

	public static void main(String[] args) {
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			//yazdigimiz sira ile okuma islemini yapmaliyiz!!!
			
//			Otomobil oto4 = (Otomobil) input.readObject();
//			Otomobil oto1 = (Otomobil) input.readObject();
//			Otomobil oto2 = (Otomobil) input.readObject();
//			Otomobil oto3 = (Otomobil) input.readObject();
//			
//			System.out.println(oto4);
//			System.out.println("motor no: " + oto4.getMotor().getMotorNo());
//			System.out.println(oto1);
//			System.out.println("motor no: " + oto1.getMotor().getMotorNo());
//			System.out.println(oto2);
//			System.out.println("motor no: " + oto2.getMotor().getMotorNo());
//			System.out.println(oto3);
//			System.out.println("motor no: " + oto3.getMotor().getMotorNo());
			
			ArrayList<Otomobil> otomobilList = (ArrayList<Otomobil>) input.readObject();
			
			for(Otomobil oto : otomobilList) {
				System.out.println(oto);
				System.out.println("motor no: " + oto.getMotor().getMotorNo());
			}
			
			ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) input.readObject();
			
			for(Ogrenci ogr : ogrenciList) {
				System.out.println(ogr);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
