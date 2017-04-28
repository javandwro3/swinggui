package pl.jwrabel.trainings.javandwro3.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by jakubwrabel on 28.04.2017.
 */
public class CurrencyCalcWindow extends JFrame {
	public static void main(String[] args) {
		new CurrencyCalcWindow();
	}

	public CurrencyCalcWindow() {
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLayout(null);

		JLabel label = new JLabel("Podaj kwotę");
		label.setSize(100, 50);
		label.setLocation(0, 0);
		add(label);

		JTextField textFieldInput = new JTextField();
		textFieldInput.setSize(100,50);
		textFieldInput.setLocation(0, 50);
		add(textFieldInput);

		JButton buttonPlnEur = new JButton("PLN -> EUR");
		buttonPlnEur.setSize(100, 50);
		buttonPlnEur.setLocation(0, 100);
		add(buttonPlnEur);

		JButton buttonEurPln = new JButton("EUR -> PLN");
		buttonEurPln.setSize(100, 50);
		buttonEurPln.setLocation(100, 100);
		add(buttonEurPln);

		JLabel label1 = new JLabel("Wynik");
		label1.setSize(100,50);
		label1.setLocation(0, 150);
		add(label1);

		JTextField textFieldResult = new JTextField();
		textFieldResult.setSize(100, 50);
		textFieldResult.setLocation(0, 200);
		add(textFieldResult);


		final DefaultComboBoxModel<String> data = new DefaultComboBoxModel<String>();
		data.addElement("A");
		data.addElement("B");
		data.addElement("C");



		JComboBox<String> comboBox = new JComboBox<String>(data);
		comboBox.setSelectedIndex(0);
		comboBox.setSize(200,50);
		comboBox.setLocation(0, 300);
		add(comboBox);


		buttonEurPln.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textFieldInput.getText();
				double amountDouble = Double.parseDouble(text);
				double result = amountDouble*4.5;
				textFieldResult.setText("" + result + " PLN");
			}
		});

		buttonPlnEur.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textFieldInput.getText();
				double amountDouble = Double.parseDouble(text);
				double result = amountDouble/4.5;
				textFieldResult.setText("" + result + " EUR");

				System.out.println("ZAZNACZONY: " + comboBox.getSelectedIndex());

			}
		});



	}
}
