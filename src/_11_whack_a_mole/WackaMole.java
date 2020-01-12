package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;
public class WackaMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
Date timeAtStart = new Date();
int k = 0;
int l = 0;
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
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton f = (JButton)e.getSource();

	if(l>5) {
		endGame(timeAtStart,l);
	}
	if(k>10) {
		endGame(timeAtStart, k);
	}
	if(f.getText().contentEquals("mole")) {
speak("you got the mole");
k++;
	}else {
		speak("you missed");
		l++;
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