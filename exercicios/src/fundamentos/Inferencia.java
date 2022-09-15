package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;// declaração e inicialização.
		System.out.println(a);
		
		a = 12;
		// a = "..." não aceita mudar o tipo depois de declarada
		
		var b = 4.5;
		System.out.println(b);
		
		var c = " texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; foi declarada como String .
		
		double d; // Variável foi declarada
		d = 123.65;// variável foi inicializada.
		System.out.println(d);// foi usada
	}
}
