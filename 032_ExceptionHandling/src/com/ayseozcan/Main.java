package com.ayseozcan;

public class Main {

	public void function3() {
		int x = 25 / 0;
		System.out.println("f3 sonu...");
		
	}

	public void function2() {
		function3();
		System.out.println("f2 sonu...");
	}

	public void function1() {
		try {
			function2();
		} catch (Exception e) {
			System.out.println("f1 de exception satiri");
		}
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.function1();
	}

}
