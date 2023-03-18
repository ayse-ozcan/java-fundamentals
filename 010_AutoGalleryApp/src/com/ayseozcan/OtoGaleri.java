package com.ayseozcan;

public class OtoGaleri {

	private String galeriAdi;
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;

	// OtoGaleri Constructor

	public OtoGaleri(String galeriAdi, int kapasite) {
		this.otomobilDizisi = new Otomobil[kapasite];
		this.galeridekiOtomobilSayisi = 0;
		this.setGaleriAdi(galeriAdi);

	}

	public void galeriyeOtomobilEkle(Otomobil otomobil) {

		if (galeridekiOtomobilSayisi < otomobilDizisi.length) { // galeride bos yer varsa otomobil eklensin
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;
			galeridekiOtomobilSayisi++;

		} else {
			System.err.println("kapasite full, arac eklenemdi");
		}

	}

	public void galeridekiOtomobillerListesi() {

		System.out.println(
				"\n\n " + this.galeriAdi + " galerisindeki otomobiller listesi" + "(kapasite:" + otomobilDizisi.length
						+ ")" + "(Galerideki anlik otomobil sayisi: " + this.galeridekiOtomobilSayisi + ")");
		for (int i = 0; i < this.galeridekiOtomobilSayisi; i++) {

			System.out.println(otomobilDizisi[i].getMarka() + " " + otomobilDizisi[i].getModel());
		}
	}

	public int findCount(String marka) {

		int counter = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if (otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				counter++;

			}
		}
		return counter;

	}

	public Otomobil[] search(String marka) {
		// count: aranan marka otomobil sayisi kadar
		int count = findCount(marka);
		Otomobil[] aramaSonuclari = new Otomobil[count];

		int sayac = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if (otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac] = otomobilDizisi[i];
				sayac++;

			}

		}
		return aramaSonuclari;
	}
	// dizinin kapasitesini degistirerek silme islemi

	public void galeridenOtomobilSil(int siraNo) {
		Otomobil[] otomobilDizisiTemp = new Otomobil[otomobilDizisi.length];
		System.out.println(siraNo + " . indexte bulunan otomobil " + galeriAdi + " galerisinden siliniyor ");

		int j = 0;
		for (int i = 0; i < otomobilDizisi.length; i++) {
			if (i != siraNo) {
				otomobilDizisiTemp[j] = otomobilDizisi[i];
				j++;
			}

		}
		this.galeridekiOtomobilSayisi--;
		otomobilDizisi = otomobilDizisiTemp;
	}

	public String getGaleriAdi() {
		return galeriAdi;
	}

	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}

	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}

}
