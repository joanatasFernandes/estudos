package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String valor = "";
//equalsIgnorecase compara o valor da string .
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você Diz: ");
			valor = entrada.nextLine();
			System.out.println(valor);
		}
		entrada.close();
	}

}
