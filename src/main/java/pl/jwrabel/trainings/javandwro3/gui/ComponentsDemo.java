package pl.jwrabel.trainings.javandwro3.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jakubwrabel on 28.04.2017.
 */
public class ComponentsDemo extends JFrame {
	public static void main(String[] args) {
		new ComponentsDemo();
	}

	public ComponentsDemo() throws HeadlessException {
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("Component demo!!!");

		JLabel jLabel = new JLabel("Example label");
		add(jLabel);

		JButton button = new JButton("Click me");
		add(button);

		JTextField textField = new JTextField("Hello!");
		add(textField);

		JTextArea textArea = new JTextArea("Hello TextArea!");
		add(textArea);

		String[] comboBoxContent = new String[]{"Dog", "Cat", "Fish"};
		JComboBox comboBox = new JComboBox<>(comboBoxContent);
		add(comboBox);

		JSlider jSlider = new JSlider(50, 200);
		add(jSlider);

		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.BLUE);
		jPanel.setPreferredSize(new Dimension(200, 50));
		jPanel.add(new JLabel("Example panel with label"));
		add(jPanel);


		JCheckBox jCheckBox = new JCheckBox("Example check box");
		add(jCheckBox);

		String[] listElements = {"Elem1", "Elem2", "Elem3"};
		JList jList = new JList(listElements);
		add(jList);

		JProgressBar jProgressBar = new JProgressBar();
		add(jProgressBar);


		Integer[][] tableContent = {{1, 2, 3}, {4, 5, 6}};
		String[] tableColumns = {"Column A", "Column B", "Column C"};
		JTable jTable = new JTable(tableContent, tableColumns);
		add(jTable);
	}

}