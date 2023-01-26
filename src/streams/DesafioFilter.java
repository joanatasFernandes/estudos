package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis", 1.99, 0.12, 0);
        Produto p2 = new Produto("Notbook", 4889.99, 0.32, 0);
        Produto p3 = new Produto("Cardeno", 10.99, 0.45, 0);
        Produto p4 = new Produto("Ipressora", 599.99, 0.25, 0);
        Produto p5 = new Produto("iPad", 899.00, 0.40, 0);
        Produto p6 = new Produto("Relogio", 110.99, 0.20, 0);
        Produto p7 = new Produto("Monitor", 1289.89, 0.12, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> superPromocao = produto -> produto.desconto >= 0.3;
        Predicate<Produto> freteGratis = produto -> produto.valorFrete == 0;
        Predicate<Produto> produtoRelevante = produto -> produto.preco >= 500;

        Function<Produto, String> chamadaPromocional = p -> "Aproveite!!!!! " + p.nome + " por R$:" + p.preco;

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);
    }
}
