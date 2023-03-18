package com.ayseozcan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DosyaKopyalayici {

	public static List<Integer> dosyaIcerigiByteList = new ArrayList<>();

	private static void dosyadanOku(String dosyaAdi) {
		// FileInputStream dosyalari binary olarak okur ve yazar.
		System.out.println("dosya okunuyor... okunan dosya adi: " + dosyaAdi);
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(dosyaAdi);
			int okunan;

			while ((okunan = fileInputStream.read()) != -1) {
				dosyaIcerigiByteList.add(okunan);
			}

		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosya okuma hatasi");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("bilinmeyen bir hata olustu");
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("file close sirasinda bir hata olustu");
					e.printStackTrace();
				}
			}
		}

	}

	private static void dosyayaKopyala(String dosyaAdi) {
		System.out.println("Dosya kopyalaniyor... dosya adi: " + dosyaAdi);
		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(dosyaAdi);

			for (int yazilacakByte : dosyaIcerigiByteList) {
				fileOutputStream.write(yazilacakByte);
			}
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadi veya buraya yazma hakkiniz yok");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosya okuma hatasi");
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println("file close sirasinda bir hata olustu");
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {

		dosyadanOku("C:\\Test3\\r2d2.jpg");

		dosyayaKopyala("C:\\Test3\\r2d2 - Copy.jpg");
		dosyayaKopyala("C:\\Test3\\r2d2 - Copy(2).jpg");
		dosyayaKopyala("C:\\Test3\\r2d2 - Copy(3).jpg");

	}

}
