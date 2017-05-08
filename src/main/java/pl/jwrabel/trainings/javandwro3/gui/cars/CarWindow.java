package pl.jwrabel.trainings.javandwro3.gui.cars;

import javax.swing.*;
import java.util.List;

/**
 * Created by jakubwrabel on 28.04.2017.
 */
public class CarWindow extends JFrame {

	private CarRepository carRepository;

	public CarWindow() {
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLayout(null);

		carRepository = new CarRepository();

		List<Car> cars = carRepository.getCars();

		// "ZAMIANA" listy na tablicę
		Car[] carsArray = new Car[cars.size()];
		for (int i = 0; i < carsArray.length; i++) {
			carsArray[i] = cars.get(i);
		}

		JList<Car> jList = new JList<>(carsArray);
		jList.setSize(200, 300);
		jList.setLocation(0, 0);
		add(jList);

		Car selectedValue = jList.getSelectedValue();
	}

	public static void main(String[] args) {
		new CarWindow();
	}
}
