package com.ayseozcan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {

	public static void main(String[] args) {
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("ogrencilerliste.bin"))){
			
			ArrayList<Ogrenci> list = (ArrayList<Ogrenci>) input.readObject();
			
			for (Ogrenci ogrenci : list) {
				System.out.println(ogrenci);
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("serialization hatasi");
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}


}
