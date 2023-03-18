package com.ayseozcan;

public class Motor {

	private int motorHacmi;
	private String saseNo = " ";
	private int yakitTuketimi;

	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) {

//		this.motorHacmi = motorHacmi;
//		this.saseNo = saseNo;
//		this.yakitTuketimi = yakitTuketimi;

		this.setMotorHacmi(motorHacmi);
		this.saseNo = saseNo;
		this.setYakitTuketimi(yakitTuketimi);

	}

	public Motor() {

	}

	public int getMotorHacmi() {
		return motorHacmi;
	}

	public void setMotorHacmi(int motorHacmi) {
		if (motorHacmi >= 800 && motorHacmi <= 10000) {
			this.motorHacmi = motorHacmi;
		} else {
			System.out.println("hacim 800 olarak kabul edildi");
			this.motorHacmi = 800;
		}

	}

	public int getYakitTuketimi() {
		return yakitTuketimi;
	}

	public void setYakitTuketimi(int yakitTuketimi) {
		if (yakitTuketimi >= 4 && yakitTuketimi <= 25) {
			this.yakitTuketimi = yakitTuketimi;
		} else {

			System.out.println("yakit tuketim degeri mantikli sinirlarin disinda, en dusuk deger ayarlaniyor");
			this.yakitTuketimi = 4;

		}

	}

	public String getSaseNo() {
		return saseNo;
	}

	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}
	
	public void setBaziMetodBilgileri(int motorHacmi, int yakitTuketimi) {
		
		this.setMotorHacmi(motorHacmi);
		this.setYakitTuketimi(yakitTuketimi);
	}

}
