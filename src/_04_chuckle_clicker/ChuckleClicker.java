package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
frame.setVisible(true);
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);
	joke.setText("Joke");
	punchline.setText("Punchline");
	frame.pack();
	joke.addActionListener(this);
	punchline.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == joke) {

		JOptionPane.showMessageDialog(null, "Once I was a male trapped in a female body");
	}
	if(e.getSource() == punchline) {

		JOptionPane.showMessageDialog(null, "Then I was born");
	}
}
}
