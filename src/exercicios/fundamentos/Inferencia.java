package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;// declara��o e inicializa��o.
		System.out.println(a);
		
		a = 12;
		// a = "..." n�o aceita mudar o tipo depois de declarada
		
		var b = 4.5;
		System.out.println(b);
		
		var c = " texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; foi declarada como String .
		
		double d; // Vari�vel foi declarada
		d = 123.65;// vari�vel foi inicializada.
		System.out.println(d);// foi usada
	}
}
