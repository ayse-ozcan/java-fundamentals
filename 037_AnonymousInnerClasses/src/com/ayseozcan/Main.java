package com.ayseozcan;

public class Main {

	public static void main(String[] args) {

		Insan vejeteryanInsan = new Insan() {

			public void yemekYe() {
				System.out.println("sadece sebze ve meyve yiyor");
			}
		};
		vejeteryanInsan.yemekYe();
		vejeteryanInsan.suIc();
		
		Insan insan = new Insan();
		insan.yemekYe();
	}

}
