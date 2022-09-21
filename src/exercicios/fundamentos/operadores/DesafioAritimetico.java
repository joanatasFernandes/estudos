package fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {
		// desafio Aritimético

		int formula1 = (6 * (3 + 2));
		var resultado1 = Math.pow(formula1, 2) / (3 * 2);
		System.out.println(resultado1);

		int formula2 = ((1 - 5) * (2 - 7)) / 2;
		var resultado2 = Math.pow(formula2, 2);
		System.out.println(resultado2);

		var resultado3 = resultado1 - resultado2;
		var resultadoFinal = Math.pow(resultado3, 3);
		var concluido = resultadoFinal / Math.pow(10, 3);
		System.out.println(concluido);

	}
}
