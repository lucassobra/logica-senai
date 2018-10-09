package tratamentoErros;

public class ExetoPonteiroNumero {
	public static void main(String[] args) {
		try {
		String a = null; 
		System.out.println(a.charAt(0);
		} catch (NullPointerExeption npe) {
			System.out.println("Nao pode chamar um método de uma referência null");
			
		}
	}

}
