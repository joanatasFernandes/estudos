package controle;

import java.util.Scanner;

public class DoWhile {

	//if(...)sente�as; ou {}
	// while(...) sente�as; ou {}
	//for (...; ...; ...) snentecas ou {}
	// do sente�as ; ou {}  while (...);
	
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		String  texto = "Por favor";
		
	do {
		System.out.println("Voc� precisa dizer as palarvras magicas!");
		System.out.print("Quer sair?");
		texto = entrada.nextLine();
		
	}while(!texto.equalsIgnoreCase("Por favor"));
	System.out.println("Muito Obrigado");
	entrada.close();
	}
	
} 

