package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 9.6;
		
		String resultadoFinal = media >= 7.0 ? "Aprovado." : "Em Recupera��o.";
		
		System.out.println("O Aluno est� " + resultadoFinal);
		

		double nota = 9.1;
		boolean bomComportamento = true;
		boolean passoPorMedia = nota >=7;
		boolean direitoDesconto = bomComportamento && passoPorMedia;
		String resultado = direitoDesconto ? "Sim." : "Na�o.";
		System.out.printf("Tem desconto ? %s" , resultado);
		
		
	}

}
