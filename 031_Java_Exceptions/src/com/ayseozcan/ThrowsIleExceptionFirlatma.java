package com.ayseozcan;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma {

	

	//hiz degeri 120 den buyukse exception firlatacagiz
	public static void hizKontrol(int hiz) throws SQLException {
		if(hiz > 120) {
			throw new SQLException(); //CHECKED EXCEPTION larin basina throws koyariz
		}else {
			System.out.println("iyi yolculuklar");
		}
	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hizinizi giriniz: ");
		int hiz = scanner.nextInt();
		
		try {
			hizKontrol(hiz);
		} catch (SQLException e) {
			System.out.println("cok hizli gidiyorsun, hizini azalt!");
		}
	}

}
