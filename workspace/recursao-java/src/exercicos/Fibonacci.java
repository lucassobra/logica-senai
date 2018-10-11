package exercicos;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;

		for (int i = 0; i <= num; i++) {
			System.out.println(fibonacci(i));

		}

	}

	public static int fibonacci(int num) {

		if (num <= 1) {
			return num;

		} else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}
}