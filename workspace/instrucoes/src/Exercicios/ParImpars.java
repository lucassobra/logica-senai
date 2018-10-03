package Exercicios;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class ParImpars {
	public static void main(String[] args) throws InterruptedException {
		
		//Preparando a aplicação para receber o input do teclado
		InputStream entradaTeclado = System.in;
		Scanner respostaUsuario = new Scanner(entradaTeclado);
		
		//Declarando as variáveis necessárias
		int numeroMaquina = 0;
		int numeroUsuario = 0;
		String escolhaUsuario = "";
		
		//Mensagem de inicio
		System.out.println("Bora jogar um par ou impar ai, meu jovem");
		
		// 1) Caso a resposta seja "Sim" entramos mo jogo
		String aceite = respostaUsuario.nextLine();
		if (aceite.equalsIgnoreCase("sim") || aceite.equalsIgnoreCase("ok") || aceite.equalsIgnoreCase("blz")) {
			System.out.println("Combinado! Vamos lá!");

			
			// 3) Penas recupera e limpa o centeudo da resposta do usuario.
			respostaUsuario.nextLine();
			
			System.out.println("Voce quer Par ou Impar");
			
			escolhaUsuario = respostaUsuario.nextLine();
			
			if(escolhaUsuario.equalsIgnoreCase("par")) {
				System.out.println("Vou impar, entao");
			} else {
				System.out.println("Vou Par entao, entao");
			}
			System.out.println("Escolha um numero de 0 a 10");
			
			if(respostaUsuario.hasNextInt()) {
				numeroUsuario = respostaUsuario.nextInt();
				
				numeroMaquina = new Random(). nextInt(10);
				
				Thread.sleep(1000);
				int Soma = numeroUsuario + numeroMaquina;
			
				System.out.println("Somando tudo deu" + Soma);
			}
			
			int Soma = numeroUsuario + numeroMaquina;
			if (Soma % 2 ==0 && escolhaUsuario.equalsIgnoreCase("Impar")) {
				
			} else if (Soma % 2 != 0 && escolhaUsuario.equalsIgnoreCase("Impar")) {
				System.out.println("Voce venceu");
			} else {
				System.out.println("Venci");
			}
					
			// 2) Caso aresposta nao seja 'Sim", nos despedimos
		} else {
			System.out.println("Voce nao sabe brincar...");
			
		} 
			
		{
			
		}
	
		
	}

}
