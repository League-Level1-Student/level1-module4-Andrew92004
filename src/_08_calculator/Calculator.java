package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JLabel label = new JLabel();
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);

	public void setup() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);

		panel.add(tf1);
		panel.add(tf2);
		panel.add(label);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b1.setText("add");
		b2.setText("subtract");
		b3.setText("multiply");
		b4.setText("divide");

		frame.pack();
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			label.setText("" + add(Double.parseDouble(tf1.getText()), Double.parseDouble(tf2.getText())));

		}
		if (e.getSource() == b2) {
			label.setText("" + subtract(Double.parseDouble(tf1.getText()), Double.parseDouble(tf2.getText())));
		}
		if (e.getSource() == b3) {
			label.setText("" + multiply(Double.parseDouble(tf1.getText()), Double.parseDouble(tf2.getText())));
		}
		if (e.getSource() == b4) {
			label.setText("" + divide(Double.parseDouble(tf1.getText()), Double.parseDouble(tf2.getText())));
		}
	}

}
