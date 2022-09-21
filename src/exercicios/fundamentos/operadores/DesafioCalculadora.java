package fundamentos.operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	// Ler num1
	// ler num2
	// + - / * %
	
	// usando o JOptionPane.showInputDialog ele não esta imprimindo nada.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		JOptionPane.showInputDialog("Digite o primeiro numero");

		JOptionPane.showInputDialog("Digite o segundo numero");
		JOptionPane.showInputDialog("digite o operador");
		
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();

		String operador = entrada.next();

		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 + num2 : resultado;
		resultado = "/".equals(operador) ? num1 + num2 : resultado;
		resultado = "*".equals(operador) ? num1 + num2 : resultado;
		resultado = "&".equals(operador) ? num1 + num2 : resultado;
		System.out.println(resultado);

		//JOptionPane.showInputDialog("O resultado é: "+ resultado);

		
		
		entrada.close();

	}
}
