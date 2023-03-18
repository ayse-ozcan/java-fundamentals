package com.ayseozcan.repository;

import java.util.List;

import com.ayseozcan.repository.entity.Ogrenci;
import com.ayseozcan.utility.Database;

public class OgrenciRepository {

	public void save(Ogrenci ogrenci) {

		Database.ogrenciListesi.add(ogrenci);

	}

	public void delete(int id) {

		Ogrenci silinecekOgrenci = null;

		for (Ogrenci ogr : Database.ogrenciListesi) {
			if (ogr.getId() == id) {
				silinecekOgrenci = ogr;
				break;
			}
		}
		if (silinecekOgrenci != null) {
			Database.ogrenciListesi.remove(silinecekOgrenci);
		}

	}

	public void update(Ogrenci ogrenci) {
		for (int i = 0; i < Database.ogrenciListesi.size(); i++) {
			if (Database.ogrenciListesi.get(i).getId() == ogrenci.getId()) {
				Database.ogrenciListesi.get(i).setAdi(ogrenci.getAdi());
				Database.ogrenciListesi.get(i).setSoyadi(ogrenci.getSoyadi());
			}
		}

	}

	public Ogrenci findById(int id) {

		Ogrenci tempOgrenci = null;

		for (Ogrenci ogr : Database.ogrenciListesi) {
			if (ogr.getId() == id) {
				tempOgrenci = ogr;
				break;
			}
		}
		return tempOgrenci;
	}

	public List<Ogrenci> findAll() {

		return Database.ogrenciListesi;
	}

}
