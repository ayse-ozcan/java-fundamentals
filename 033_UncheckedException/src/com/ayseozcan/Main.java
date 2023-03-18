package com.ayseozcan;

import java.util.Scanner;

public class Main {

	public static void hizKontrol(int hiz) {
		if(hiz > 120) {
			throw new AsiriHizException("asiri hiz yapilmak isteniyor");
		}else {
			System.out.println("iyi yolculuklar");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hiz: ");
		int hiz = scanner.nextInt();
		
		try {
			Main.hizKontrol(hiz);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("byee");
	}

}
