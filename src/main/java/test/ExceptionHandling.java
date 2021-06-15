package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a, b;
			b = 0;
			a = 5 / b;
			System.out.print("A");
		} catch (ArithmeticException e) {
			System.out.print("B");
		}
	}

}
