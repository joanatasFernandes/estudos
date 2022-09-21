package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a média: ");
		
		double media = entrada.nextDouble();
		boolean criterioDeAprovacao = media <= 10 && media >= 7.0;
		if (criterioDeAprovacao) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");			
		}
		boolean criterioDeRecuperacao = media < 7 && media >= 4.5;
		if (criterioDeRecuperacao) 
			System.out.println("Recuperação");
		
		boolean criterioDeReprovcao = media < 4.5 && media >= 0;
			if(criterioDeReprovcao) {
				System.out.println("Reprovado");
			
		}
		
		entrada.close();
	}
}
