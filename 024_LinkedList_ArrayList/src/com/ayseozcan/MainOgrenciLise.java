package com.ayseozcan;

import java.util.ArrayList;
import java.util.List;

public class MainOgrenciLise {

	public static void main(String[] args) {
		
		List<OgrenciLise> ogrenciler = new ArrayList<OgrenciLise>();
		ogrenciler.add(new OgrenciLise("asda", 500, 70));
		ogrenciler.add(new OgrenciLise("dqwqq", 554, 80));
		
		System.out.println(ogrenciler);
		

	}

}
