package _11_whack_a_mole;

import java.util.Random;

public class wackamolerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WackaMole w = new WackaMole();
		w.setup(new Random().nextInt(24));
	}

}
