package com.velioz;

public class YardimciSinif {
	public static void hello() {
		System.out.println("hello from yardimciSinif");
	}
	protected static void hello2() {
		System.out.println("hello2");
		
		YardimciSinif.hello2();
	}
		private static void hello3() {
			System.out.println("hello3");
		}
		public static void main(String[] args) {
			YardimciSinif.hello3();
		}
	}

