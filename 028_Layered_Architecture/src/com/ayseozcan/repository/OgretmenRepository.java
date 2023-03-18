package com.ayseozcan.repository;

import java.util.List;

import com.ayseozcan.repository.entity.Ogretmen;
import com.ayseozcan.utility.Database;

public class OgretmenRepository {

	// ogretmen kaydini veritabanina atar
	public void save(Ogretmen ogretmen) {
		Database.ogretmenListesi.add(ogretmen);

	}

	public void delete(int id) {
		Ogretmen silinecekOgretmen = null;

		for (Ogretmen ogr : Database.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == id) {
				silinecekOgretmen = ogr;
				break;
			}
		}
		if (silinecekOgretmen != null) {
			Database.ogrenciListesi.remove(silinecekOgretmen);
		}

	}

	public void update(Ogretmen ogretmen) {
		for (int i = 0; i < Database.ogretmenListesi.size(); i++) {
			if (Database.ogretmenListesi.get(i).getTcKimlikNo() == ogretmen.getTcKimlikNo()) {
				Database.ogretmenListesi.get(i).setAdi(ogretmen.getAdi());
				Database.ogretmenListesi.get(i).setSoyadi(ogretmen.getSoyadi());
			}
		}
		
	}

	public Ogretmen findById(int id) {
		Ogretmen tempOgretmen = null;

		for (Ogretmen ogr : Database.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == id) {
				tempOgretmen = ogr;
				break;
			}
		}
		return tempOgretmen;
	}

	public List<Ogretmen> findAll() {
		return Database.ogretmenListesi;
	}

}
