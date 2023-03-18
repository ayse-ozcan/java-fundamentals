package com.ayseozcan;

public class Motor {

	private int motorHacmi;
	private String saseNo = " ";
	private int yakitTuketimi;

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
		this.yakitTuketimi = yakitTuketimi;
	}

	public String getSaseNo() {
		return saseNo;
	}

	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}

}
