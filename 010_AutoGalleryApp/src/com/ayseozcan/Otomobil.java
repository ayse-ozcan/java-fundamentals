package com.ayseozcan;

public class Otomobil {

	public static final String ARAC_TIPI = "Kara Araci";

	private String marka;
	private String model;
	private int yil;
	private int aracinKm;

	private Motor motor;
	private int depodakiYakit;
	private final int depoHacmi;

	public Otomobil(String marka, String model, int yil, int aracinKm, Motor motor, int depoHacmi) {

		this.setAracinKm(aracinKm);
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);

		this.setMotor(motor);
		this.depoHacmi = depoHacmi;
		this.depodakiYakit = 0;

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

	public int getDepodakiYakit() {
		return depodakiYakit;
	}

	public void setDepodakiYakit(int depodakiYakit) {
		this.depodakiYakit = depodakiYakit;
	}

	public int getDepoHacmi() {
		return depoHacmi;
	}

	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", aracinKm=" + aracinKm + ", motor="
				+ motor + ", depodakiYakit=" + depodakiYakit + ", depoHacmi=" + depoHacmi + "]";
	}

}
