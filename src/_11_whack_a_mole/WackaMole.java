package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class WackaMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
public void setup(int j) {
	frame.add(panel);
	frame.setVisible(true);
	for(int i = 0; i < 24; i++) {
if (i==j) {
	JButton c = new JButton("mole");
	c.addActionListener(this);
	panel.add(c);
}else {
	JButton d = new JButton();
	d.addActionListener(this);
	panel.add(d);
}
	}
	frame.setPreferredSize(new Dimension(250,300));
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton f = (JButton)e.getSource();
	if(f.getText().contentEquals("mole")) {
speak("you got the mole");
	}else {
		speak("you missed");
	}
	frame.remove(panel);
	panel = new JPanel();
	setup(new Random().nextInt(24));
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}