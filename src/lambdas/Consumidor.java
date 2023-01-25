package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!!!");

        Produto p1 = new Produto("Caneta", 13.34, 0.9);
        imprimir.accept(p1);


        Produto p2 = new Produto("NotBook", 2897.99, 0.25);
        Produto p3 = new Produto("Caderno", 19.90, 0.3);
        Produto p4 = new Produto("Borracha", 7.90, 0.18);
        Produto p5 = new Produto("Lápis", 4.39, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);

    }
}
