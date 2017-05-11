package pl.jwrabel.trainings.javandwro3.gui.cars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 28.04.2017.
 */
public class CarRepository {
	private List<Car> cars;

	public CarRepository() {
		cars = new ArrayList<>();

		cars.add(new Car("Opel", "Vectra", "2003", 100));
		cars.add(new Car("Ford", "Mondeo", "2010", 180));
		cars.add(new Car("Ford", "Mustang", "2015", 280));
		cars.add(new Car("Nissan", "Micra", "1995", 70));
	}

	public List<Car> getCars() {
		return cars;
	}

	public void saveToFile() {

	}
}
