package Exercicios;

import java.util.Random;

public class exercicio003 {
	public static void main(String[] args) {
		int n = new Random().nextInt(7) + 1;
		
		switch (n) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda Feira");
			break;
		
		case 3:
			System.out.println("Terca Feira");
			break;
		case 4:
			System.out.println("Quarta Feira");
			break;
		case 5:
			System.out.println("Quinta Feira");
			break;
			
		case 6:
			System.out.println("Sexta Feira");
			break;
		case 7:
			System.out.println("Sexta Feira");
			break;
		default:
			System.out.println();
			break;
			
			
		}
		
	
	}

}
