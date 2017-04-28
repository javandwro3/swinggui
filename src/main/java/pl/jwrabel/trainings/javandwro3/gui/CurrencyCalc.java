package pl.jwrabel.trainings.javandwro3.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jakubwrabel on 28.04.2017.
 */
public class CurrencyCalc {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setSize(600, 400);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());

		final JTextField textFieldPLN = new JTextField();
		textFieldPLN.setPreferredSize(new Dimension(200, 50));
		window.add(textFieldPLN);

		JButton button = new JButton("Przelicz");
		window.add(button);

		final JTextField textFieldEUR = new JTextField();
		textFieldEUR.setPreferredSize(new Dimension(200, 50));
		window.add(textFieldEUR);


		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String plnAmountString = textFieldPLN.getText();
				double amount = Double.parseDouble(plnAmountString);
				double amountEur = amount / 4.5;
				textFieldEUR.setText("" + amountEur);
			}
		});
	}
}
