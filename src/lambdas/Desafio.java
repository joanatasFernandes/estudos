package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Ipa", 3235.89, 0.13);
        /*
         * 1. A partir do produto calcular o preço real (Com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Insento)
         * 3. frete: >= 300 (100) /  < 3000 (50)
         * 4. Arredondar: deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 300 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é: " + preco);
    }
}
