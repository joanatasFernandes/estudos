package controle;

import java.util.Scanner;

public class DasfioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int qtdNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe a nota: (ou -1 p/ sair) : ");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {
				total += nota;
				qtdNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida ;D");
			}
		}
		//Calcula media
		double media = total / qtdNotas;
		System.out.println("Média = " + media);
		entrada.close();

	}
}
