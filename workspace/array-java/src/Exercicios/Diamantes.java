package Exercicios;

public class Diamantes {
	public static void main(String[] args) {

		int d = 0;
		int centro = 40;

		for (int x = 0; x < 80; x++) {
			int esquerda = centro - d;
			int direita = centro + d;

			for (int i = 0; i < 80; i++) {
				if (i <= esquerda) {
					System.out.print(" ");
				} else if (i >= direita) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}

			System.out.println();
			
		
		if (x < 40 ) {
			d++;
		} else {
			d--;
		}} 

	}
}
