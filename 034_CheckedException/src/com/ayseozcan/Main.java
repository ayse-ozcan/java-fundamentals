package com.ayseozcan;

import java.util.Scanner;

public class Main {

	public static void hizKontrol(int hiz) throws AsiriHizException {
		if(hiz > 150) {
			throw new AsiriHizException("coook asiri hiz yapilmak isteniyor");
			
		}else if(hiz > 120){
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
			hizKontrol(hiz);
		} catch (AsiriHizException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
