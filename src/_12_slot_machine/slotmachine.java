package _12_slot_machine;

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

public class slotmachine implements ActionListener {
	JButton spin = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel [] myArr = {new JLabel(),new JLabel(),new JLabel(),};

public void setup() {

	panel.add(spin);
spin.setText("spin");
	spin.addActionListener(this);
	frame.setVisible(true);
	frame.add(panel);
	frame.pack();
	try {
		myArr[0] = createLabelImage("cherry.jpg");
		myArr[1] = createLabelImage("lime.jpg");
		myArr[2]= createLabelImage("orange.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int c = 0;
		int l = 0;
		int o = 0;

		for (int i = 0; i < 3; i++) {
			if (Math.random() > 0.3 && Math.random() < 0.6) {
				System.out.println("cherry");
				c++;
				try {
					myArr[i] = createLabelImage("cherry.jpg");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else if (Math.random() < 0.3) {
				System.out.println("lime");
				l++;
				try {
					myArr[i] = createLabelImage("lime.jpg");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				System.out.println("orange");
				o++;
				try {
					myArr[i] = createLabelImage("orange.jpg");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if (c >= 3) {
			System.out.println("win");
			speak("win");
		}
		if (l >= 3) {
			System.out.println("win");
			speak("win");
		}
		if (o >= 3) {
			System.out.println("win");
			speak("win");
		}
		frame.remove(panel);
		panel = new JPanel();

		panel.add(spin);
		panel.add(myArr[0]);
		panel.add(myArr[1]);
		panel.add(myArr[2]);

		frame.add(panel);
		frame.pack();

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
