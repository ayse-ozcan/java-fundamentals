package com.ayseozcan;

//bir class i Thread sinifindan extends ederseniz, extends ettiginiz bu yeni class da bir Thread olur.

public class Yazici extends Thread {

	private String isim;

	public Yazici(String isim) {
		this.isim = isim;

	}

	public String getIsim() {
		return isim;

	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Yazici [isim=" + isim + "]";
	}

	// Thread imiz start() ettirildiginde calisacak kodlar run () metodunun icine
	// yazilmalidir
	@Override
	public void run() {

		System.out.println(this.isim + " isimli thread calisiyor");

		for (int i = 0; i <= 10; i++) {
			System.out.println(this.isim + " yaziyor: " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(this.isim + " isimli thread bitti");
	}

}
