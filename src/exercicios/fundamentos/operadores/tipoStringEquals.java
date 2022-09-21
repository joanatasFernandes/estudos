package fundamentos.operadores;

import java.util.Scanner;

public class tipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();//next não pega os espaços em braca, mais se usar o nextline o resultado pode ser difernte pois ele não elimina os espaços em branco digitado pelo usuario.
		System.out.println("2" == s2.trim());//trim elimina os espaços da entrada que o usuario ira digtar. 
		System.out.println("2".equals(s2.trim()));

		entrada.close();
	}

}
