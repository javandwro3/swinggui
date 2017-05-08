package pl.jwrabel.trainings.javandwro3.gui.cars;

import javax.swing.*;
import java.awt.event.ActionEvent;
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

		JButton btnShow = new JButton("Pokaż");
		btnShow.setSize(200, 50);
		btnShow.setLocation(0, 350);
		add(btnShow);

		btnShow.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Car selectedCar = jList.getSelectedValue();
				System.out.println(selectedCar);

				JOptionPane.showMessageDialog(btnShow, selectedCar);
			}
		});



	}

	public static void main(String[] args) {
		new CarWindow();
	}
}
