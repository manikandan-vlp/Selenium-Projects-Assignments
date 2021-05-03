package week3.day1;

public class Calculator {

	public void add(int num1, int num2) {

		int res = num1 + num2;

		System.out.println(res);

	}

	public void add(int num1, int num2, int num3) {

		int res = num1 + num2 + num3;

		System.out.println(res);

	}

	public void multi(int num1, int num2) {

		System.out.println(num1 * num2);

	}

	public void multi(int num1, double num2) {
		// TODO Auto-generated method stub

		System.out.println(num1 * num2);

	}

	public void div(int num1, int num2) {

		System.out.println(num1 / num2);

	}

	public void div(int num1, double num2) {
		// TODO Auto-generated method stub
		System.out.println(num1 / num2);

	}

	public void subtract(int num1, int num2) {
		// TODO Auto-generated method stub

		System.out.println(num1 - num2);

	}

	public void subtract(double num1, double num2) {
		// TODO Auto-generated method stub

		System.out.println(num1 - num2);

	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		calculator.add(10, 12);
		calculator.add(10, 20, 30);

		calculator.multi(10, 50.43);
		calculator.multi(50, 100);

		calculator.div(12, 12.50);
		calculator.div(14, 52);

		calculator.subtract(14, 34);
		calculator.subtract(14, 35.4);

	}

}
