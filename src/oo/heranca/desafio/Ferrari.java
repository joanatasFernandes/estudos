package oo.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari() {
        super(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        super.acelerar();

        if (velocidadeAtual >= 0) {
            velocidadeAtual += 15;
        }
    }
}
