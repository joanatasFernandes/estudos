package classe;

import java.util.List;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25; // foi defnido com static para que seja possivel aplicar o desconto em todos os produtos
// não sendo nescessario passar p desconto no construtor.
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	Produto() {

	}

	public List<Produto> listaNome;

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto);
	}
}
