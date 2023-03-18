package com.ayseozcan;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma2 {

	// hiz degeri 120 den buyukse exception firlatacagiz
	public static void hizKontrol(int hiz) throws SQLException {
		if (hiz > 120) {
			throw new SQLException(); // CHECKED EXCEPTION larin basina throws koyariz
		} else {
			System.out.println("iyi yolculuklar");
		}

	}

	//Main metod basliginda throws ile exception atmasi, API olarak
	//kodumuzu kullanacak kisinin yakalamsi icindir.
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hizinizi giriniz: ");
		int hiz = scanner.nextInt();
		
		hizKontrol(hiz);

	}
}