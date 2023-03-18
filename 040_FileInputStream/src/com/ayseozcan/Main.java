package com.ayseozcan;

import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class Main {

	private static byte[] c;

	public static void dosyadanTekBirByteOkuma() {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");
			char c = (char) fileInputStream.read();
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.print(c);
			c = (char) fileInputStream.read();
			System.out.println(c);

			int okunan = fileInputStream.read();
			System.out.println(okunan);
			// dosyanin sonuna ulastiginda read -1 doner.
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosya okuma sirasinda hata olustu");
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("bilinmeyen bir hata olustu");
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

			} catch (Exception e2) {
				System.out.println("Kapatma sirasinda hata olustu");
				e2.printStackTrace();
			}

		}

	}

	public static void dosyaninOrtasindanByteOkuma() {
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");

			fileInputStream.skip(5);
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosya okuma sirasinda hata olustu");
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("bilinmeyen bir hata olustu");
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

			} catch (Exception e2) {
				System.out.println("Kapatma sirasinda hata olustu");
				e2.printStackTrace();
			}

		}

	}

	public static void dosyaninTumunuOkuma() {
		FileInputStream fileInputStream = null;
		int okunan;
		String metin = "";
		try {
			fileInputStream = new FileInputStream("dosya.txt");
			while ((okunan = fileInputStream.read()) != -1) {
				metin = metin + (char) okunan;
			}
			System.out.println(metin);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosya okuma sirasinda hata olustu");
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("bilinmeyen bir hata olustu");
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

			} catch (Exception e2) {
				System.out.println("Kapatma sirasinda hata olustu");
				e2.printStackTrace();
			}

		}

	}

	public static void dosyaninBelirliBirKisminiOku() {
		try {
			FileInputStream fileInputStream = new FileInputStream("dosya.txt");
			fileInputStream.skip(7);

			byte[] karakterler = new byte[3];
			fileInputStream.read(karakterler);
			String metin = new String(karakterler);

			System.out.println(metin);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void dosyaninBelirliBirKisminiOku(int n, int m, String dosyaAdi) {
		// hocanin cozumu
		
		FileInputStream fileInputStream = null;
		int okunan;
		String metin = "";

		try {
			fileInputStream = new FileInputStream(dosyaAdi);
			fileInputStream.skip(n);
			int sayac = 0;
			while ((okunan = fileInputStream.read()) != -1) {
				metin = metin + (char) okunan;
				sayac++;

				if (sayac == m) {
					break;
				}
				System.out.println(metin);
			}
		} catch (FileNotFoundException e) {
			System.out.println("belirtilen dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("dosya yazma/okuma hatasi");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		/*
		 * dosyadanTekBirByteOkuma(); System.out.println("Hoscakalin");
		 * 
		 * dosyaninOrtasindanByteOkuma(); dosyaninTumunuOkuma();
		 */
		// Odev:
		// Bir metod yaziniz.
		// Bir dosyanin n. karakterinden baslayip m tane karakter okuyup ekrana yazsin
		// dosyaninBelirtilenKisminiOKu
		// 7. karakten baslayip 3 tane karakter okusun
		dosyaninBelirliBirKisminiOku();
		dosyaninBelirliBirKisminiOku(7, 3, "dosya.txt");
	}

}
