package exercicos;

public class Exponencial {
	public static void main(String[] args) {
		System.out.println("Somando...");
		System.out.println(Calcular(3,3 ));
		
	}
	
	public static int Calcular(int n1, int n2) {
		if (n2 ==0)  {
			System.out.print( " = ");
			return 1;
		} else {
			System.out.print(n1 + " * ");
			return n1 * Calcular(n1,--n2);
		}
	}

}
