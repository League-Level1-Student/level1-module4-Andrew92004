package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrickOrTreat implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JFrame frame1 = new JFrame();
	JPanel panel = new JPanel();
	public static void main (String[] args) {
		TrickOrTreat blah = new TrickOrTreat();
		blah.setup();
	}
	public void setup(){
		frame1.setVisible(true);
		button1.addActionListener(this);
		button1.setText("Trick");
		button2.addActionListener(this);
		button2.setText("Treat");
      panel.add(button1);
      panel.add(button2);
      frame1.add(panel);
        frame1.pack();
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);

	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if (e.getSource().equals(button1)) {
		showPictureFromTheInternet("https://d17fnq9dkz9hgj.cloudfront.net/breed-uploads/2018/09/dog-landing-hero-lg.jpg");
	}
	if (e.getSource().equals(button2)) {
		showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/selfie-with-work-colleague-royalty-free-image-1568750576.jpg");
	}
	}
}
