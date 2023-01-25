package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQadrado = n -> n * n;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQadrado)
                .apply(0);
        System.out.println(resultado1);

        int resultado2 = aoQadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);

        System.out.println(resultado2);
    }
}
