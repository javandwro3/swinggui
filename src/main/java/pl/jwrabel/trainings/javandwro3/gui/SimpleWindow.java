package pl.jwrabel.trainings.javandwro3.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jakubwrabel on 28.04.2017.
 */
public class SimpleWindow {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setSize(600, 400);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());

		// Dodanie przycisku do okna
		JButton button = new JButton("Kliknij mnie");
		window.add(button);

		// Dodanie textFielda
		final JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 50));
		window.add(textField);



		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				System.out.println(text);

				textField.setText("Hello!!!!");

				double x = 1.2;
				// ZAMIANA LICZBY NA STRINGA
				String xString = "" + x;
				String x2String = Double.toString(x);
				String x3String = String.valueOf(x);

			}
		});
	}
}
