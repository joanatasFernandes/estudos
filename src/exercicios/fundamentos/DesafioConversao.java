package fundamentos;

import java.util.Scanner;



public class DesafioConversao {
	
	public static void main(String[] args) {
		 
		Scanner  entrada = new Scanner(System.in);
		
		/*System.out.print("Digite o primeiro s�lario");
		String salario1 = entrada.nextLine();
		
		System.out.print("Digite o segundo s�lario");
		String salario2 = entrada.nextLine();
		
		System.out.print("Digite o terceiro s�lario");
		String salario3 = entrada.nextLine();*/
		
		System.out.print("Digite o primeiro s�lario");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o segundo s�lario");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o terceiro s�lario");
		String salario3 = entrada.next().replace(",", ".");
		
		 double  valor1 = Double.parseDouble(salario1);
		 double  valor2 = Double.parseDouble(salario2);
		 double  valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3 ;
		System.out.print("A soma dos s�larios �: " + soma +"\n");
		System.out.print("A M�dia dos s�larios �: " + soma / 3);
		
		entrada.close();
	}
	
}
