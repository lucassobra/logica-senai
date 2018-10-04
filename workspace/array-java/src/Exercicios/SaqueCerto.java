package Exercicios;

public class SaqueCerto {
	public static void main(String[] args) {
		 int [] notas = {100,50,20,10,5,2,1};
		 
		 int saque = 1247;
		 for (int i = 0; i < notas.length; i++ ) {
			 
			 int resultado = saque / notas[i];
			 System.out.println("notas de" + notas[i]+ " : "+ resultado);
			 saque = saque % notas [i];
			 
			 
			 
		 }
	}

}
