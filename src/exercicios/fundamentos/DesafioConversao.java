package fundamentos;

import java.util.Scanner;



public class DesafioConversao {
	
	public static void main(String[] args) {
		 
		Scanner  entrada = new Scanner(System.in);
		
		/*System.out.print("Digite o primeiro sálario");
		String salario1 = entrada.nextLine();
		
		System.out.print("Digite o segundo sálario");
		String salario2 = entrada.nextLine();
		
		System.out.print("Digite o terceiro sálario");
		String salario3 = entrada.nextLine();*/
		
		System.out.print("Digite o primeiro sálario");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o segundo sálario");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o terceiro sálario");
		String salario3 = entrada.next().replace(",", ".");
		
		 double  valor1 = Double.parseDouble(salario1);
		 double  valor2 = Double.parseDouble(salario2);
		 double  valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3 ;
		System.out.print("A soma dos sálarios é: " + soma +"\n");
		System.out.print("A Média dos sálarios é: " + soma / 3);
		
		entrada.close();
	}
	
}
