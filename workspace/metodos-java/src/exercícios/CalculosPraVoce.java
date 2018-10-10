package exercícios;

import javax.swing.SingleSelectionModel;

public class CalculosPraVoce {
	public static void main(String[] args) {
		System.out.println(CalculosPraVoce.soma(2.0, 4.0));
		
		System.out.println(CalculosPraVoce.subtracao(120.0, 10.0));
		
		// igual ao de cima, mas guarda uma variavel, pra depois imprimir
		double resultado = CalculosPraVoce.divisao(120.0, 10.0);
		System.out.println(resultado);
		
	
		System.out.println(CalculosPraVoce.multiplicacao(3.0, 3.0));
		
	}
		
		public static double soma(double num1, double num2) {
			return num1 + num2;
		}
		public static double divisao(double num1, double num2) {
			return num1 / num2;
		}
		public static double multiplicacao(double num1, double num2) {
			return num1 * num2;
		}
		public static double subtracao(double num1, double num2) {
			return num1 - num2;
		}
	

	

}
