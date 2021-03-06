package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class TypingTutor implements KeyListener {
JFrame frame = new JFrame();
char currentLetter;
JLabel label = new JLabel();
JPanel panel = new JPanel();
public void Setup() {
	frame.addKeyListener(this);
	currentLetter = generateRandomLetter();
	label.setText(currentLetter+"");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.setVisible(true);
panel.add(label);
frame.add(panel);
}
public static void main(String[] args) {
	TypingTutor type = new TypingTutor();
	type.Setup();
}

char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("you typed: " +e.getKeyChar());
	if(e.getKeyChar()==currentLetter) {
		panel.setBackground(Color.GREEN);
	}else {
		panel.setBackground(Color.red);
	}
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter+"");
	
}
}