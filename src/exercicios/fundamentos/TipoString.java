package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Jonathan";
		var sobrenome = "Fernandes";
		var idade = 38;
		var salaraio = 9754.89;
		
		String maisUmaFresa = "nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade "
				+ idade + "\nSálario " 
				+ salaraio + "\n\n ";
		System.out.println(maisUmaFresa);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.",
				nome, sobrenome, idade, salaraio);
		System.out.println(frase);
						
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f. \n\n",
				nome, sobrenome, idade, salaraio);
		
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
				
		
	}
}
