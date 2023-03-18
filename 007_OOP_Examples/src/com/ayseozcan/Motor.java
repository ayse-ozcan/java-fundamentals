package com.ayseozcan;

public class Motor {
	
	public int motorHacmi;
	public String saseNo;
	public int yakitTuketimi;
	
	public void motorBilgileriniYazdir() {
		
		System.out.println("motor hacmi: " + this.motorHacmi + " saseNo: " + this.saseNo + " yakit tuketimi: " + this.yakitTuketimi);
	}
}
