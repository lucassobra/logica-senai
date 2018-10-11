package exercicos;

public class ContadorOrelhasGatos {
	public static void main(String[] args) {
		System.out.println("Somando...");
		System.out.println(contarOrelhas(5));
		
	}
	
	public static int contarOrelhas(int gatos) {
		if (gatos ==0) {
			System.out.print(  " Contar Orelhas ");
			return 0;
		} else {
			return 2 + contarOrelhas(gatos -1);
		}
		
			
		
	}
}

