package Exercicios;

public class MediaAritmetica {
	public static void main(String[] args) {
		int nota [] = {7,3,3,5};
		int soma = 0;
		
		for (int i = 0; i <=3; i++) {
		int v = nota [i];
		soma += v;
		
		} soma = soma / nota.length;
		if (soma >=5) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		 
	}

}
