package lambdas;

public class Produto {
    final String nome;
    final Double preco;
    final double desconto;

    public Produto(String nome, Double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return "Nome: " + nome + "Tem o preço de: R$ " + precoFinal;
    }
}
