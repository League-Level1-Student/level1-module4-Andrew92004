package _08_calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c = new Calculator();
c.setup();
		System.out.println(c.add(1,2));
		System.out.println(c.subtract(1,2));
		System.out.println(c.multiply(1,2));
		System.out.println(c.divide(1,2));
	}

}
