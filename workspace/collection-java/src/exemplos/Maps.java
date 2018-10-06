package exemplos;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<Integer, String> alunosLogica = new HashMap<>();
		
		alunosLogica.put(1, "Alex");
		alunosLogica.put(2, "Alexandre");
		alunosLogica.put(3, "André");
		
		System.out.println(alunosLogica);
		
		for (Integer key : alunosLogica.keySet()) {
			System.out.println("chave " + key);
			System.out.println(alunosLogica.get(key));
		}
HashMap<String, String> empresas = new HashMap<>();
		
		empresas.put("Apple", "Empresa de eletonicos");
		empresas.put("Walmart", "Empresa de varejo");
		empresas.put("Sony", "Empresa de eletronicos");
		
		String descricaoAplle = empresas.get("Aplle");
		System.out.println(descricaoAplle);
		
		System.out.println(empresas.size());
		
		empresas.remove("Sony");
		System.out.println(empresas);
	}

}
