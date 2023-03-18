package com.ayseozcan;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneleriOku {

	public static void main(String[] args) {
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			Otomobil oto = null;
			
			while((oto = (Otomobil) input.readObject()) != null) {
				if(oto != null)
					System.out.println(oto);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
			System.out.println("dosya sonu");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("bye");

	}

}
