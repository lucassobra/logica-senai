package tratamentoErros;

public class ExcecaoIndiceStringNaoExiste {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 9;
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Esse �ndice est� fora ");
			aiobe.printStackTrace();

		}

	}

}
