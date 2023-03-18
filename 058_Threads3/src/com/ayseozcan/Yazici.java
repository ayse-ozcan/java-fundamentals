package com.ayseozcan;

//Thread olusturma yontem 2:
//runnable interfacesini implement edin!

public class Yazici implements Runnable{

	private String isim;
	
	
	
	public Yazici(String isim) {
		super();
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



	@Override
	public void run() {
		System.out.println(this.isim + " thread calisiyor");
		
		for (int i = 1; i < 5; i++) {
			System.out.println(this.isim + " yaziyor " + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.isim + " thread bitti");
	}

}
