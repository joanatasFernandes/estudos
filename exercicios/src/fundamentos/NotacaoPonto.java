package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		String s = "Bom dia x";
		s = s.replace("x", "Senho Jonathan");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Jojou".toUpperCase();
		System.out.println(x);
		
		String y = "Bom Dia X"
				.replace("X", "JOJOU")
				.toUpperCase()
				.concat("!!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
