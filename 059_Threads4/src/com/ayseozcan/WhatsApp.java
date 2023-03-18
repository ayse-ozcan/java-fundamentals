package com.ayseozcan;

public class WhatsApp implements Runnable {

	private String isim;

	public WhatsApp(String isim) {
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
		return "WhatsApp [isim=" + isim + "]";
	}

	@Override
	public void run() {
		System.out.println(this.isim + " thread calisiyor");
		for (int i = 0; i < 50; i += 3) {
			System.out.println(this.isim + " yaziyor " + i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.err.println(this.isim + " thread bitti");

	}

}
