package exempols;

public class Explicita {
	public static void main(String[] args) {
		int num2 = 100;
		double num1 = 1000;
		long resultadoDiv = (long) (num1 / num2);
		
		System.out.println(resultadoDiv);
		
		float num3 = 8.556496f;
		double num4 = 16.51614f;
		double resultadoMult = num3 * num4;
		System.out.println(resultadoMult);
		
		
		long resultadoFinal = (long) (num3 * num4);
		System.out.println(resultadoFinal);
		
	}

}
