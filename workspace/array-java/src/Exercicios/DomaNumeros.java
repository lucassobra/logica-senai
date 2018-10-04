package Exercicios;

public class DomaNumeros {
	public static void main(String[] args) {
		
		double valor [] = {3.5,1.5,3.5,1.5};
		double acumulador = 0;
		
		for ( int i = 0; i<=3; i++) {
			double v = valor[i];
			acumulador = acumulador + v;
			System.out.println(acumulador);	
		}
		
}	

}
