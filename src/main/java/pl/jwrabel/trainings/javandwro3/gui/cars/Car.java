package pl.jwrabel.trainings.javandwro3.gui.cars;

/**
 * Created by jakubwrabel on 28.04.2017.
 */
public class Car {
	private String brand;
	private String model;
	private String manufactureYear;
	private double power;

	public Car(String brand, String model, String manufactureYear, double power) {

		this.brand = brand;
		this.model = model;
		this.manufactureYear = manufactureYear;
		this.power = power;
	}

	@Override
	public String toString() {
		return brand + ", " + model + ", " + manufactureYear + ", " + power;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(String manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
}
