package com.ayseozcan.ornek2;

import java.util.Objects;

//eger bir sinifi hashSet ile kullanacaksaniz hashSetin dogru calismasi icin
//equals ve hashSet metodlarini implement etmeniz gerekir.

public class Kisi {
	private String ad;
	private int id;

	public Kisi(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int hashCode() {
		return Objects.hash(id);
		
	}
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Kisi other = (Kisi) obj;
		return (Objects.equals(id, other.id));
		
		
	}

	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", id=" + id + "]";
	}
	

}
