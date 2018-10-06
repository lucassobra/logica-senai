package exemplos;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		String[] nomes = { "Lucas", "Fulano", "Ciclano", "Beltrano " };

		System.out.println(nomes);

		ArrayList<String> listaNomes = new ArrayList<>();

		listaNomes.add("Lucas");
		listaNomes.add("Fulano");
		listaNomes.add("Ciclano");
		listaNomes.add("Beltrano");

		System.out.println(listaNomes);
		int tamanhoListaNomes = listaNomes.size();
		
		System.out.println("ArrayList:" + tamanhoListaNomes);
		
		int tamanhoArrayNomes = nomes.length;
		System.out.println("Array:" + tamanhoArrayNomes);
		
		boolean existeNome = listaNomes.contains("Fulano");
		System.out.println(existeNome);
		
		existeNome = listaNomes.contains("Lucas");
		System.out.println(existeNome);
		
		boolean FoiRemovido = listaNomes.remove("Lucas");
		System.out.println(FoiRemovido);
		
		FoiRemovido = listaNomes.remove("Vantarius");
		System.out.println(FoiRemovido);
		
		System.out.println(listaNomes);
		
		String nomeEscolhido = listaNomes.get(0);
		System.out.println(nomeEscolhido);
		int indiceDoBeltrano = listaNomes.indexOf("Beltrano");
		String beltrano = listaNomes.get(indiceDoBeltrano);
		System.out.println(beltrano);
		
		System.out.println("=addALL=====================================");
		ArrayList<String> listaDeOutrosNomes = new ArrayList<>();
		listaDeOutrosNomes.add("Charmander");
		listaDeOutrosNomes.add("Squirte");
		listaDeOutrosNomes.add("Bulbasaur");
		
		listaNomes.addAll(listaDeOutrosNomes);
		
		System.out.println(listaNomes);
		
	}	
		
		

}
