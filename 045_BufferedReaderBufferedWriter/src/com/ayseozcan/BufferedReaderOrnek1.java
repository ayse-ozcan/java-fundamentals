package com.ayseozcan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderOrnek1 {

	private static void dosyadanBirSatirOku() {
		try (BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))) {

			String s = reader.readLine();
			System.out.println(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void dosyaninTamaminiOku() {
		try (BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))) {
			String s = null;
			while ((s = reader.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		dosyadanBirSatirOku();
		dosyaninTamaminiOku();

	}

}
