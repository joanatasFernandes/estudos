package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia\n\n");
		
		System.out.println("bom");
		System.out.println("Dia!");
		
		System.out.printf("Mega sena %d %d %d %d %d %d %n", 1, 5, 2 ,4 , 3, 6);
		System.out.printf("salario: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Jonathan");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome =  entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();

	}
}
