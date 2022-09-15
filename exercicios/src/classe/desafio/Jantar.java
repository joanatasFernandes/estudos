package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arros", 0.800);
		Comida c2 = new Comida("Feijão", 0.230);
		
		Pessoa p = new Pessoa("Joao Gordo", 89.0);
		Pessoa p2 = new Pessoa("Victor", 95.0);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
	}
}
