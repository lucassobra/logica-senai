package exercicos;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println("Somando...");
		System.out.println(fatorial(4));
		
	}
	
	public static int fatorial(int n1) {
		if (n1 ==0) {
			System.out.print(  " = ");
			return 1;
		} else {
			System.out.print(n1 + " * ");
			return n1 * fatorial(--n1);
		}
		
		
	}

}
