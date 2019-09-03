package ex.One;

public class MinOfTwo {
	
	public static void main(String[] args) {
		System.out.println(minOfTwo(25,-10));
	}

	public static int minOfTwo(int a, int b) {
		if (b > a) {
			return a;
		}
		else {
			return b;
		}
	}
}
