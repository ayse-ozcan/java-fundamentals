package com.ayseozcan;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	// file writer ile sadece text dosyalari yazilabilir.
	// write() metodunun icine direkt string verilebilir.
	public static void main(String[] args) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("dosya.txt", true);
			//FileWriter ile dosyayi byte a cevirmeden direkt string olarak yazabiliriz
			fileWriter.write("Ayse Ozcan\n");
			fileWriter.write("Aylin Ozcan");
			
		} catch (IOException e) {
			System.out.println("dosya acilirken veya yazarken hata olustu");
			e.printStackTrace();
		}finally {
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (Exception e2) {
					System.out.println("dosya kapatilirken hata olustu");
					e2.printStackTrace();
				}
			}
		}
		System.out.println("bye");

	}

}
