package ex.One;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

	public static int factorial(int a) {
		int result = 1;
		for (int i = 1; i <= a; i++) {
			result = result * i;
		}
		return result;
	}
}