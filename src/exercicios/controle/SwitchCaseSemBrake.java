package controle;

public class SwitchCaseSemBrake {
	public static void main(String[] args) {

		String faixa = "preta";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o bassai-dai....");
		case "marron":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heio Godan");
		case "verde":
			System.out.println("Sei o heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nida");
		case "amarela":
			System.out.println("Sei o Heian  Shodan");
			break;
		default:
			System.out.println("Não Sei da nada!");
		}
		System.out.println("fim");
	}

}
