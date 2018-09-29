package instrucoes;

public class Scwitch {
	public static void main(String[] args) {
		String passeio = "montanha";
		
		switch (passeio) {
			case "montanha":
				System.out.println("Bora escalar");
				break;
			case "deserto":
				System.out.println("Leva uma agua!");
				break;
			case "floresta":
				break;
			case "mar":
				System.out.println("compra uma boia");
				break;
			default:
				System.out.println("Ah, bora assistir netflix");
				break;
	
		}
		
	}

}
