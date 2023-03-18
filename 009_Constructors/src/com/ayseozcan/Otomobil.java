package com.ayseozcan;

public class Otomobil {

	public static final String ARAC_TIPI = "Kara Araci";

	private String marka;
	private String model;
	private int yil;
	private int aracinKm;

	private Motor motor;

	public Otomobil(String marka, String model, int yil, int aracinKm, Motor motor) {

		this.setAracinKm(aracinKm);
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);

		this.setMotor(motor);

	}
	
	public Otomobil(String marka, String model) {
		
		this.setMarka(marka);
		this.setModel(model);
	}
	
	

	public Otomobil(String model, int yil, Motor motor) {
		super();
		this.model = model;
		this.yil = yil;
		this.setMotor(motor);
	}

	public Otomobil() {

	}

	public void araciSur(int km) {
		System.out.println("Arac " + km + " km yol aliyor");
		aracinKm = aracinKm + km;

	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getAracinKm() {
		return aracinKm;
	}

	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		if (motor != null) {
			this.motor = motor;
		} else {
			System.out.println("motor nesnesi yok");
		}

	}

	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", aracinKm=" + aracinKm + ", motor="
				+ motor + "]";
	}

	
		

}
