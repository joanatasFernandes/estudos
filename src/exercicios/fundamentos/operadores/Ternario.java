package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 9.6;
		
		String resultadoFinal = media >= 7.0 ? "Aprovado." : "Em Recuperação.";
		
		System.out.println("O Aluno está " + resultadoFinal);
		

		double nota = 9.1;
		boolean bomComportamento = true;
		boolean passoPorMedia = nota >=7;
		boolean direitoDesconto = bomComportamento && passoPorMedia;
		String resultado = direitoDesconto ? "Sim." : "Naão.";
		System.out.printf("Tem desconto ? %s" , resultado);
		
		
	}

}
