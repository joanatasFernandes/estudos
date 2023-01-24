package lambdas;

@FunctionalInterface // conceito que vai ajudar a criar uma unica funcção dentro da intargface
// Para definir labmdas emcima de interfaces, é necessário ter uma interface funcional.
public interface Calculo {
    double executar(double a, double b);

    default String legal() {
        return "Legal";
    }

    static String muitoLegal() {
        return "Muito legal";
    }
}
