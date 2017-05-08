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

		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setSize(200, 50);
		lblBrand.setLocation(300, 0);
		add(lblBrand);

		JTextField txtBrand = new JTextField();
		txtBrand.setSize(200, 50);
		txtBrand.setLocation(300, 50);
		add(txtBrand);

		JLabel lblModel = new JLabel("Model");
		lblModel.setSize(200, 50);
		lblModel.setLocation(300, 100);
		add(lblModel);

		JTextField txtModel = new JTextField();
		txtModel.setSize(200, 50);
		txtModel.setLocation(300, 150);
		add(txtModel);

		JLabel lblYear = new JLabel("Manufacture year");
		lblYear.setSize(200, 50);
		lblYear.setLocation(300, 200);
		add(lblYear);

		JTextField txtYear = new JTextField();
		txtYear.setSize(200, 50);
		txtYear.setLocation(300, 250);
		add(txtYear);

		JLabel lblPower = new JLabel("Power");
		lblPower.setSize(200, 50);
		lblPower.setLocation(300, 300);
		add(lblPower);

		JTextField txtPower = new JTextField();
		txtPower.setSize(200, 50);
		txtPower.setLocation(300, 350);
		add(txtPower);

		btnShow.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Car selectedCar = jList.getSelectedValue();
				System.out.println(selectedCar);

				if (selectedCar != null) {
					String model = selectedCar.getModel();
					txtModel.setText(model);

					txtBrand.setText(selectedCar.getBrand());
					txtModel.setText(selectedCar.getModel());
					txtYear.setText(selectedCar.getManufactureYear());

					txtPower.setText("" + selectedCar.getPower());
					txtPower.setText(Double.toString(selectedCar.getPower()));
				}

				// Wyświetlenie okna dialogowego
//				JOptionPane.showMessageDialog(btnShow, selectedCar);
			}
		});
	}

	public static void main(String[] args) {
		new CarWindow();
	}
}
